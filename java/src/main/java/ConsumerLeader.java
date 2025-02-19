public class ConsumerLeader {
    public static void main(String[] args) {
//        System.out.println("sgeo_cclog_sync_cn".hashCode()%32);
        // System.out.println(Math.abs("sgeo_cclog_sync_cn_cg3".hashCode() % 32));
        //5 11 17 23 29
        //System.out.println(Math.abs("etl-consumer-EdgeOne1".hashCode() % 32));
        //System.out.println(Math.abs("ckafka-kzambo8x#scf_ckafka-kzambo8xtopic-2ew3wxzklam-cc05dy3o$DEFAULT".hashCode() % 9));

        //scf_ckafka-kzambo8xtopic-2ew3wxzklam-cc05dy3o$DEFAULT

        System.out.println(Math.abs("ckafka-odd8v6av#notify".hashCode()) % 3);


    }
}
