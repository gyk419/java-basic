package poly.ex5;

//인터페이스를 상속받을때는 extends가 아닌 implements를 사용
public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("mung mung");
    }

    @Override
    public void move() {
        System.out.println("move dog");
    }
}
