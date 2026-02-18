package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
//        if (count < max){
//            this.count++;
//        } else{
//            System.out.println("최대치입니다.");
//        }
        //검증 로직
        if (count >= max) {
            System.out.println("최대치입니다.");
            return;
        }
        //실행 로직
        count++;

    }

    public int getCount(){
        return this.count;
    }
}
