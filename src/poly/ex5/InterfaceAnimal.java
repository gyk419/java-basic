package poly.ex5;

//인터페이스는 class가 아니라 interface 키워드 사용
//인터페이스는 다중 구현(다중 상속)을 지원 -> 추후 학습
public interface InterfaceAnimal {
    //public abstract void sound();
    //public abstract void move();
    //인터페이스는 메서드에 public abstract 가 생략 되어있음, 생략 권장!
    void sound();
    void move();

    //인터페이스는 멤버 변수 public, static, final이 모두 포함되었다고 간주, 생략 권장!
    //어차피 인터페이스랑은 무관함 -> static은 메서드 영역의 static 영역에 생성
    //public static final double MY_PI = 3.14;
    double MY_PI = 3.14;

    /*물론 default, private 메서드 구현 가능 하지만 예외적으로 아주 특별한 경우에만 사용
    * 학습 단계에서는 이 부분들을 고려하지 않는 것이 좋다
    * 추후 뒤에서 다룰 예정
    * */
}
