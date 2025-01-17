import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수 :" );
        String strNum1 = scanner.nextLine();

        System.out.println("두 번째 수 :" );
        String strNum2 = scanner.nextLine();

        double num1 = Integer.parseInt(strNum1);
        double num2 = Integer.parseInt(strNum2);

        double sum = num1 / num2;

        if(num2 == 0 || num2 == 0.0){
            System.out.println("결과:무한대");
        }else {

            System.out.println("결과:" + sum);
        }

    }
}