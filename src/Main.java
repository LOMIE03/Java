public class Main {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;
        String var3 = "AB";
        String var4 = "AB";
        String var5 = new String("AB");

        if (var1 == var2) {
            System.out.println("var1과 var2는 변수 값이 같습니다.");
        }if(var1 != var2){
            System.out.println("var1과 var2는 변수 값이 다릅니다.");
        }else{
            System.out.println("var1과 var2는 변수 값이 같습니다.");
        }
        if(var3 == var4){
            System.out.println("var3와 var4의 참조객체는 같습니다");
        }if (var3 != var5){
            System.out.println("var3와 var5의 참조객체는 다릅니다");
        }else{
            System.out.println("var3와 var5의 참조객체는 같습니다");
        }if(var4.equals(var5)){
          System.out.print("var4와 var5는 문자열이 같습니다.");
        }

    }
}