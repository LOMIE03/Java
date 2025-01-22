public class Main {
    public static void main(String[] args) {

        String hobby = null;

        System.out.println(hobby.length());
// NullPointerExcption 발생 (참조객체룰 지정하지 않고(null) 문자열의 길이를 측정)

        String name = "홍자바";
        name = null;
//  참조객체 생성 이후(String name = "홍자바";)
//  변수를 null로 지정하면(name = null;) 전에 있던 참조객체는 자동으로 메모리에서 삭제됨.
    }
}