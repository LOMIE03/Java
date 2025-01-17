import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수 :" );
        String strNum1 = scanner.nextLine();
//       ㄴ>처음 키보드에 입력되는 값
        System.out.println("두 번째 수 :" );
        String strNum2 = scanner.nextLine();
//       ㄴ>두번째로 키보드에 입력되는 값
        double num1 = Integer.parseInt(strNum1);
//       ㄴ>첫번째 입력 값(문자열)을 실수로 변환
        double num2 = Integer.parseInt(strNum2);
//       ㄴ>두번째 입력 값(문자열)을 실수로 변환
        double sum = num1 / num2;
//       ㄴ>실수 1 나누기 실수 2
        if(num2 == 0 || num2 == 0.0){
            System.out.println("결과:무한대");
//            ㄴif 실수 2가 0 or 0.0일때 무한대
        }else {

            System.out.println("결과:" + sum);
//            ㄴif 외의 값
        }

    }
}