public class Main {
    public static void main(String[] args) {
        float x = 0.1f;
     for(; x<=1.0; x+=0.1f) {
         System.out.println(x);
     }
          System.out.println("float타입으로 넘어가는 값:" + x);

        double y=0.1;

     for(; y<=1.0; y+=0.1){
         System.out.println(y);
     }
        System.out.println("double타입으로 넘어가는 값:" + y);
    }
}