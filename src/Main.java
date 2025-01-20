public class Main {
    public static void main(String[] args) {
        int num = 0;

        int i = 0;
        for (; i <= 100; i++) {

            if(i%3 != 0){
                continue;
         }
            num += i;
            System.out.println(num);
        }
        System.out.println("3의 배수의 총합:" + num);

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("3의 배수의 합: " + sum);
    }
}