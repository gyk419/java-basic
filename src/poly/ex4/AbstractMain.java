package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw()};
        for (AbstractAnimal animal : animals) {
            animal.sound();
            animal.move();
        }
    }

    private static void soundMove(AbstractAnimal animal) {
        animal.sound();
        animal.move();
    }
}
