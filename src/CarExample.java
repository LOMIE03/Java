public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if (gasState) {
            System.out.println("출발합니다");
            myCar.run();
        }

        if(myCar.isLeftGas()){ //if의 조건식에 메소드 호출코드 올수 있음, true나 false 리턴을 해야함
            System.out.println("gas를 주입할 필요가 없습니다.");
        }else{
            System.out.println("gas를 주입하세요.");
        }
    }
}
