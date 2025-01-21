public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for(int j = 1; j <= i; j++) {
//                ㄴ중첩된 for문은 변수 초기화(int j = 1;)를 이 라인으로 돌아올때마다 함
                System.out.print("*");
                if (j == i){
                    System.out.println();
                }
            }
        }
    }
}