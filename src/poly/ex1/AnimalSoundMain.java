package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        cat.sound();
        dog.sound();
        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {
        caw.sound();
    }
}
