package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name= "학생1";
        student1.age= 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age= 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: "+ students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: "+ students[1].age + " 성적: " + students[1].grade);

        // 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도 필요 -> 이 설계도가 바로 클래스
        // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 or 인스턴스라 한다.
    }
}
