public class Main {
    public static void main(String[] args) {

        int x = 50000;
        long y = x;
// 작은 타입(int)에서 큰타입(long)으로 넘어갈때는 그냥 지정해도됨
        long x2 = 5;
        int y2 = (int) x2;
// 큰 타입에서 작은 타입으로 넘어갈때는 지정해줘야함
        System.out.println(y);
    }
}