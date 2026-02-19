package poly.ex6;

//상속은 하나만, implements는 무한정 가능
public class Bird extends Animals implements Fly {

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 난다~~");
    }
}
