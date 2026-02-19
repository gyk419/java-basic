package poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("move cat");
    }

    @Override
    public void sound() {
        System.out.println("miyaooong");
    }
}
