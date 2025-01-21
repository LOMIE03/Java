import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            int num1 = scanner.nextInt();
            System.out.println("선택> " + num1);
            if(num1 > 4){
                System.out.println("보기에 있는 숫자를 눌러주세요");
                continue;
            }
            if(num1 == )

            if(num1 == 1) {
                System.out.println("예금액 > 10000");
                continue;
            }
            if(num1 == 2){
                System.out.println("출금액 > 2000");
//                continue;
            }
            if(num1 == 3){
                System.out.println("잔고 > 8000");
//                continue;
            }
            if(num1 == 4){

                break;
            }



        }
        System.out.println("프로그램 종료");
    }
}