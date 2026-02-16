package ref;

public class IninMain {
    public static void main(String[] args) {

        InitData data = new InitData();
        System.out.println("value1=" + data.value1); //멤버변수 0으로 자동초기화
        System.out.println("value2=" + data.value2);
    }
}
