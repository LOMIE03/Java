import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       String number = scanner.nextLine();
       String tel = scanner.nextLine();

       System.out.println("1. 이름: " +  name);
       System.out.println("2. 주민번호 앞 6자리: " + number);
       System.out.println("3. 전화번호: " + tel);


    }
}