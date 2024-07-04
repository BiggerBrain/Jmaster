package nio;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.Metadata;
import org.apache.kafka.clients.admin.*;
import org.apache.kafka.clients.admin.internals.AdminMetadataManager;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.Node;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.config.ConfigResource;
import org.apache.kafka.common.config.SaslConfigs;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PublicNetCheckService {

    public static void main(String[] args) {
        System.out.println("version:1.0");
        Properties props = new Properties();
        //设置接入点，请通过控制台获取对应Topic的接入点。
        props.put("bootstrap.servers", "150.158.225.98:50002");
        props.put("topic", "test1");

        //设置SASL_PLAINTEXT 接入
        initSaslPlainText(props);

        //消息队列Kafka版消息的序列化方式。
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //请求的最长等待时间。
        props.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, 30 * 1000);
        //设置客户端内部重试次数。
        props.put(ProducerConfig.RETRIES_CONFIG, 5);
        props.put(ProducerConfig.ACKS_CONFIG, "1");
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, false);
        //设置客户端内部重试间隔。
        props.put(ProducerConfig.RECONNECT_BACKOFF_MS_CONFIG, 3000);

        //构造消费对象，也即生成一个消费实例。
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer(props);
        System.out.println("============================================");
        //展示Topic列表
        System.out.println("consumer.listTopics检测");
        Map<String, List<PartitionInfo>> topicList = consumer.listTopics();


        for (Map.Entry<String, List<PartitionInfo>> topicInfoMap : topicList.entrySet()) {
            System.out.println("topic列表" + topicInfoMap.getKey());
            System.out.println("topic分区信息" + ":" + topicInfoMap.getValue());
        }
        System.out.println("============================================");
        System.out.println();

        System.out.println("producer.send test1 topic检测");
        try {
            //构造一个消息队列Kafka版消息。
            String topic = "test1"; //消息所属的Topic，请在控制台申请之后，填写在这里。
            String value = "this is kafka msg value"; //消息的内容。
            //构造Producer对象，注意，该对象是线程安全的，一般来说，一个进程内一个Producer对象即可。
            KafkaProducer<String, String> producer = new KafkaProducer(props);
            //批量获取Future对象可以加快速度。但注意，批量不要太大。
            for (int i = 0; i < 10; i++) {
                //发送消息，并获得一个Future对象。
                ProducerRecord<String, String> kafkaMessage = new ProducerRecord(topic, value + ": " + i);
//                Future<RecordMetadata> metadataFuture = producer.send(kafkaMessage);
                //同步获得Future对象的结果。
                //              RecordMetadata recordMetadata = metadataFuture.get(3, TimeUnit.SECONDS);
                // System.out.println("写入OK:" + recordMetadata.toString());
            }
            producer.close();
            System.out.println("============================================");
            System.out.println();

            System.out.println("获取元数据");
            try {
                Class<?> clazz = KafkaProducer.class;

                // 获取指定字段
                Field field = clazz.getDeclaredField("metadata");
                // 如果字段是私有的，我们需要调用setAccessible(true)方法
                field.setAccessible(true);
                Metadata metadata = (Metadata) field.get(producer);
                System.out.println("元数据controller: " + metadata.fetch().controller().toString());
                System.out.println("元数据: " + metadata.fetch().toString());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            System.out.println("============================================");
            System.out.println();
        } catch (Exception e) {
            //客户端内部重试之后，仍然发送失败，业务要应对此类错误。
            e.printStackTrace();
        }

        System.out.println("AdminClient检测");
        System.out.println("AdminClient检测");
        System.out.println("AdminClient检测");
        System.out.println("AdminClient检测");

//        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,"49.232.125.233:50000");
        try (AdminClient adminClient = AdminClient.create(props)) {
            DescribeClusterResult describeClusterResult = adminClient.describeCluster();
            System.out.println("controller:" + describeClusterResult.controller());

            //System.out.println("前端："+JacksonUtil.writeAsString(describeClusterResult1));
            //System.out.println("结果："+JacksonUtil.writeAsString(describeClusterResult).equals(JacksonUtil.writeAsString(describeClusterResult1)));

            for (Node node : describeClusterResult.nodes().get()) {
                System.out.println("Node:" + node);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            AdminClient adminClient = AdminClient.create(props);
//            DescribeClusterResult describeClusterResult = adminClient.describeCluster();
//            System.out.println("controller:" + describeClusterResult.controller());
//            for (Node node : describeClusterResult.nodes().get()) {
//                System.out.println("Node:" + node);
//            }
            //目前只需要非内置topic
            ListTopicsOptions options = new ListTopicsOptions();
            options.listInternal(false);
            ListTopicsResult listTopicsResult = adminClient.listTopics(options);

            try {
                listTopicsResult.names().get(1, TimeUnit.SECONDS);

                DescribeTopicsResult describeTopicsResult = adminClient.describeTopics(listTopicsResult.names().get());
                System.out.println("describeTopicsResult:" + describeTopicsResult.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Class<?> clazz = KafkaAdminClient.class;
                // 获取指定字段
                Field metadataManagerField = clazz.getDeclaredField("metadataManager");
                // 如果字段是私有的，我们需要调用setAccessible(true)方法
                metadataManagerField.setAccessible(true);
                AdminMetadataManager metadataManager = (AdminMetadataManager) metadataManagerField.get(adminClient);

                Class<?> metadataManagerClass = AdminMetadataManager.class;

                // 获取指定字段
                Field updaterField = metadataManagerClass.getDeclaredField("updater");
                // 如果字段是私有的，我们需要调用setAccessible(true)方法
                updaterField.setAccessible(true);
                AdminMetadataManager.AdminMetadataUpdater updater = (AdminMetadataManager.AdminMetadataUpdater) updaterField.get(metadataManager);


                System.out.println("元数据controller: " + metadataManager.controller().toString());
                System.out.println("元数据: " + updater.fetchNodes().toString());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            System.out.println("adminClient.listTopics:" + Collections.singletonList(listTopicsResult.listings().get()));
            System.out.println("============================================");
            System.out.println();
            if (listTopicsResult != null
                && listTopicsResult.names() != null
                && !listTopicsResult.names().get().isEmpty()) {
                Collection<ConfigResource> resources = new ArrayList();
                for (String name : listTopicsResult.names().get()) {
                    ConfigResource configResource = new ConfigResource(ConfigResource.Type.TOPIC, name);
                    resources.add(configResource);
                }
                DescribeConfigsResult describeConfigsResult = adminClient.describeConfigs(resources);
                System.out.println("adminClient.describeConfigs:" + describeConfigsResult.all().get().toString());
                System.out.println("============================================");
                System.out.println();
            }
            ListConsumerGroupsResult listConsumerGroupsResult = adminClient.listConsumerGroups();
            System.out.println("adminClient.listConsumerGroups:" + listConsumerGroupsResult.all().get());
            System.out.println("============================================");
            System.out.println();
            for (ConsumerGroupListing consumerGroupListing : listConsumerGroupsResult.all().get()) {
                DescribeConsumerGroupsResult describeConsumerGroupsResult = adminClient.describeConsumerGroups(Collections.singletonList(consumerGroupListing.groupId()));
                System.out.println(" adminClient.describeConsumerGroups:" + describeConsumerGroupsResult.all().get());
                System.out.println("============================================");
                System.out.println();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initSaslPlainText(Properties props) {
        if (true) {
            String prefix = "org.apache.kafka.common.security.plain.PlainLoginModule";
            String username = "ckafka-r8k37ajr#src";
            String password = "12345678a";
            String jaasConfig = String.format("%s required username=\"%s\" password=\"%s\";", prefix, username, password);
            props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_PLAINTEXT");
            //  SASL_PLAINTEXT 公网接入
            props.put(SaslConfigs.SASL_JAAS_CONFIG, jaasConfig);
            //  SASL 采用 Plain 方式。
            props.put(SaslConfigs.SASL_MECHANISM, "PLAIN");
        }
    }
}