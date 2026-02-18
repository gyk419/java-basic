package access;

import com.helloshop.product.Product;

public class Speaker {
    //int volume;
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("이미 최대 음량입니다.");
            volume = 100;
        } else {
            volume+=10;
            System.out.println("음량 10증가");
        }

    }
    void volumeDown(){
        if(volume <= 0){
            System.out.println("이미 최소 음량입니다.");
            volume = 0;
        } else {
            volume-=10;
            System.out.println("음량 10감소");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
