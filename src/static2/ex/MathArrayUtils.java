package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
        throw new AssertionError();
        //throw new AssertionError()는
        // “이 코드는 절대 실행되면 안 된다”는
        // 개발자 검증용 강제 종료 코드다.

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }
    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
