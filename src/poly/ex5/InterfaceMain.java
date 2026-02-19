package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterFaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundMove(cat);
        soundMove(dog);
        soundMove(caw);

    }

    private static void soundMove(InterfaceAnimal animal) {
        animal.sound();
        animal.move();
    }
}
