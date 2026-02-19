package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단, 자식의 기능은 호출할 수 없다.
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // poly(부모 변수)에 있는 참조값 Child 타입으로 다운캐스팅 //
        // [poly를 바꾸는게 아님 java는 항상 값을 복사하여 변경]
        child.childMethod();

        /*
         * 업캐스팅: 부모 타입으로 변경
         * 다운캐스팅: 자식 타입으로 변경
         */
    }
}
