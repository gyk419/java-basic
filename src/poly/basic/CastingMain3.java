package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child; // 업캐스팅은 앞의 (Parent) 생략 가능, 권장 [많이 사용하기 때문]

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
