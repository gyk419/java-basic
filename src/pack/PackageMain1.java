package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지면 패키지 경로 생략 가능
        pack.a.User user = new pack.a.User(); // 다른 패키지면 패키지 경로 포함해서 클래스 적어주어야함
    }
}
