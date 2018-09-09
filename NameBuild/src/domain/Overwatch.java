package domain;

import java.util.HashMap;
import java.util.Map;

public class Overwatch {
    Map<String,String> firstName = new HashMap<>();
    Map<String,String> midName = new HashMap<>();
    Map<String,String> lastName = new HashMap<>();

    public Overwatch() {
        firstName = new HashMap<>();
        firstName.put("ㄱ","자기집에서");
        firstName.put("ㄴ","하나무라 성안에서");
        firstName.put("ㄷ","할리우드에서");
        firstName.put("ㄹ","블리자드 회사에서");
        firstName.put("ㅁ","그리스 우물 안에서");
        firstName.put("ㅂ","화물차 위에서");
        firstName.put("ㅅ","A거점 앞에서");
        firstName.put("ㅇ","PC방에서");
        firstName.put("ㅈ","66번 국도에서");
        firstName.put("ㅊ","정크랫 타이어 위에서");
        firstName.put("ㅋ","시공의 폭풍 안에서");
        firstName.put("ㅌ","바스티온 머리 위에서");
        firstName.put("ㅍ","메이 장벽 뒤에서");
        firstName.put("ㅎ","D.Va 집에서");

        midName = new HashMap<>();
        midName.put("ㄱ","스프레이를 뿌리는");
        midName.put("ㄴ","윈스턴에게 죽빵을 맞는");
        midName.put("ㄷ","메르시의 치유를 받는");
        midName.put("ㄹ","화물을 열심히 미는");
        midName.put("ㅁ","전리품 상자를 여는");
        midName.put("ㅂ","메이코패스에게 얼려지는");
        midName.put("ㅅ","최고의플레이로 선정된");
        midName.put("ㅇ","힐러 좀 하라고 성질내는");
        midName.put("ㅈ","D.Va의 로봇을 타고 있는");
        midName.put("ㅊ","6명 전원 처치하는");
        midName.put("ㅋ","혼자 거점을 점령하는");
        midName.put("ㅌ","루시우의 노래를 듣는");
        midName.put("ㅍ","위도우의 저격을 맞는");
        midName.put("ㅎ","게임을 안 사서 못 하는");

        lastName = new HashMap<>();
        lastName.put("ㄱ","허접");
        lastName.put("ㄴ","겐지충");
        lastName.put("ㄷ","젠야타");
        lastName.put("ㄹ","로드호그");
        lastName.put("ㅁ","트레이서충");
        lastName.put("ㅂ","토르비욘의 포탑");
        lastName.put("ㅅ","초딩");
        lastName.put("ㅇ","바스티온의 본체(새)");
        lastName.put("ㅈ","한조충");
        lastName.put("ㅊ","태진아 맥크리");
        lastName.put("ㅋ","프로게이머");
        lastName.put("ㅌ","파라");
        lastName.put("ㅍ","레스토랑스");
        lastName.put("ㅎ","위도우메이커충");

    }

    public String getName(String first, String mid, String last){
        String fName = firstName.get(first);
        String mName = midName.get(mid);
        String lName = lastName.get(last);

        String fullName = fName + " " + mName + " " + lName;

        return fullName;
    }


}




