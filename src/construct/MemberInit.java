package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자 자동 생성
    // 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.

    /*
    MemberInit(){

    }
    */

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        //this. >> 멤버변수를 가르킴 (내부적으로 객체의 참조값을 나타냄 ex) X001.)
    }
}
