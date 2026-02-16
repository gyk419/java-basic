package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        //절차 지향 프로그래밍

        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);

        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);

        //볼륨 감소
        volume--;
        System.out.println("volume = " + volume);

        //음악 플레이어 상태
        if (isOn = true){
            System.out.println("음악 플레이어가 켜져있습니다.");
        } else System.out.println("음악 플레이어가 꺼져있습니다.");

        //음악 플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        isOn = false;


    }
}
