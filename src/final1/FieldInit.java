package final1;

public class FieldInit {
    //상수
    static final int CONST_VALUE = 10;

    //final 변수
    final int value = 10; //인스턴스 여러 개 생성 시 메모리 낭비 -> 그래서 위의 static final로 상수만듬.


    /* 컴파일 오류
    public FieldInit(int value) {
        this.value=value;
    }
    */
}
