package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count="+Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count="+Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count="+Data3.count);

        //추가
        //인스턴스를 통한 static 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count="+data4.count); //권장하지 않음 (코드를 읽을 때 마치 인스턴스 변수에 접근하는 것 처럼 오해 가능)

        //클래스를 통한 static 접근
        System.out.println(Data3.count);
    }
}
