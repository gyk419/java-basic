package oop1;

/*
 *  메서드 추출
 */

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 감소
        volumeDown(data);

        //음악 플레이어 상태
        playerState(data);

        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        System.out.println("음악 플레이어를 종료합니다.");
        data.isOn = false;
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("volume = " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("volume = " + data.volume);
    }

    static void playerState(MusicPlayerData data){
        if (data.isOn = true){
            System.out.println("음악 플레이어가 켜져있습니다.");
        } else System.out.println("음악 플레이어가 꺼져있습니다.");
    }
}
