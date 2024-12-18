public class NullPoint {
    public static void main(String[] args) {
        try {
            int i = 0;
            int i1 = 10 / i;
        } catch (ArithmeticException e) {
            System.out.println("null");
            throw e;
        } catch (Exception e) {
            System.out.println("e");
            e.printStackTrace();
        }
    }
}
