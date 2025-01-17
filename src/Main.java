public class Main {
    public static void main(String[] args) {
     float var1 = 10f;
     float var2 = var1 / 100;
//     10f / 100 != 0.1 이므로 if문을 넘어감
     if(var2 == 0.1) {
         System.out.println("10%입니다.");
     }else{
         System.out.println("10%가 아닙니다.");
     }
    }
}