package oop1;

/*
 *  음악 플레이어와 관련된 데이터 묶기
 */

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        data.volume++;
        System.out.println("volume = " + data.volume);

        //볼륨 증가
        data.volume++;
        System.out.println("volume = " + data.volume);

        //볼륨 감소
        data.volume--;
        System.out.println("volume = " + data.volume);

        //음악 플레이어 상태
        if (data.isOn = true){
            System.out.println("음악 플레이어가 켜져있습니다.");
        } else System.out.println("음악 플레이어가 꺼져있습니다.");

        //음악 플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        data.isOn = false;
    }
}
