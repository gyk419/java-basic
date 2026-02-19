package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        sound(dog);
        sound(bird);
        sound(chicken);

        fly(bird);
        fly(chicken);
    }

    //Animals 사용가능
    private static void sound(Animals animals) {
        animals.sound();
        animals.move();
    }

    //Fly 인터페이스 있으면 사용가능
    private static void fly(Fly fly) {
        fly.fly();
    }
}
