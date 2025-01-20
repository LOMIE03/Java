public class Main {
    public static void main(String[] args) {

        for (int m = 1; m <= 100; m++) {
            System.out.println("***" + m + "단 ***");
            for (int n = 1; n <= 100; n++) {
                System.out.println(m + "x" + n + "=" + (m * n));
            }
        }
    }
}