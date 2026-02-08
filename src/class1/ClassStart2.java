package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] students = new String[]{"학생1", "학생2", "학생3"};
        int[] studentAges = new int[]{15, 16, 17};
        int[] studentGrades = new int[]{90, 89, 80};

        for (int i = 0; i < 3; i++) {
            System.out.println("이름: "+students[i]+" 나이: "+studentAges[i]+" 점수: "+studentGrades[i]);
        }
    }

}
