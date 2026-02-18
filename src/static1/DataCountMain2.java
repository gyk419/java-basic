package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        //인스턴수 갯수 잘 측정되긴 하지만 불편한 점이 있다.
        //별도의 counter 인스턴스를 만들어야하는 불편 -> (static)
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count="+counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count="+counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count="+counter.count);
    }
}
