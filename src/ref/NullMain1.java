package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        // GC(가비지 컬렉션) [C언어에서는 직접 인스턴스 제거] -> 자바는 JVM의 GC가 더 이상 사용하지 않는 인스턴스 자동으로 메모리 제거
        System.out.println("3. data = " + data);

    }
}
