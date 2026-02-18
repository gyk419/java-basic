package pack;

//import pack.a.User; // pack.a. 안에 여러개를 import 하고싶으면
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지면 패키지 경로 생략 가능

        //pack.a.User user = new pack.a.User();
        User user = new pack.a.User();
    }
}
