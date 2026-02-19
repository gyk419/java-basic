package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드는 body({}) 부분 있으면 안됨

    //추상(abstract)메서드가 하나라도 있는 클래스는 추상 클래스로 선언
    //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
