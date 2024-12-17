import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.ListTopicsOptions;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class PublicNetCheckService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Properties properties = new Properties();
        //设置接入点，请通过控制台获取对应Topic的接入点。
        properties.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "81.69.183.189:50008");
        properties.setProperty(org.apache.kafka.clients.CommonClientConfigs.CLIENT_ID_CONFIG, "PublicDestAdminClient#" + UUID.randomUUID());
        if (true) {
            //如果客户指定ACL，则采用ACL连接，只支持SASL_PLAINTEXT
            String prefix = "org.apache.kafka.common.security.plain.PlainLoginModule";
            String jaasConfig = String.format("%s required username=\"%s\" password=\"%s\";", prefix, "ckafka-wd4vnppd#desc", "12345678a");
            properties.put(org.apache.kafka.clients.CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_PLAINTEXT");
            //  SASL_PLAINTEXT 公网接入
            properties.put(org.apache.kafka.common.config.SaslConfigs.SASL_JAAS_CONFIG, jaasConfig);
            //  SASL 采用 Plain 方式。
            properties.put(org.apache.kafka.common.config.SaslConfigs.SASL_MECHANISM, "PLAIN");
        }
        System.out.println(properties);

        try (org.apache.kafka.clients.admin.AdminClient adminClient = org.apache.kafka.clients.admin.AdminClient.create(properties)) {
            //目前只需要非内置topic
            ListTopicsOptions options = new ListTopicsOptions();
            options.listInternal(false);
            CreateTopicsResult lsx = adminClient.createTopics(Collections.singletonList(new NewTopic("lssssx", 1, (short) 1)));
            System.out.println(lsx.all().get());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private static void initSaslPlainText(Properties props) {
//        if (true) {
//            String prefix = "org.apache.kafka.common.security.plain.PlainLoginModule";
//            String username = "ckafka-7kdkjk3d#test12345";
//            String password = "test12345";
//            String jaasConfig = String.format("%s required username=\"%s\" password=\"%s\";", prefix, username, password);
//            props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_PLAINTEXT");
//            //  SASL_PLAINTEXT 公网接入
//            props.put(SaslConfigs.SASL_JAAS_CONFIG, jaasConfig);
//            //  SASL 采用 Plain 方式。
//            props.put(SaslConfigs.SASL_MECHANISM, "PLAIN");
//        }
//    }
}
