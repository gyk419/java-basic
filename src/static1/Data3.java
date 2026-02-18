package static1;

public class Data3 {
    public String name;

    //static -> 인스턴스끼리 공용으로 함께 사용하는 변수
    //이렇게 멤버변수에 static을 붙이면 static변수, 정적 변수, 클래스 변수라 한다.
    public static int count;

    public Data3(String name) {
        this.name = name;
//        Data3.count++; Data3. 생략가능
        count++;
    }
}
