package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit ci1 = new ConstructInit(10);
        ConstructInit ci2 = new ConstructInit(20);
        System.out.println(ci1.value);
        System.out.println(ci2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fi1 = new FieldInit();
        FieldInit fi2 = new FieldInit();
        FieldInit fi3 = new FieldInit();
        System.out.println(fi1.value);
        System.out.println(fi2.value);
        System.out.println(fi3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
