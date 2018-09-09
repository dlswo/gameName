package domain;

import java.util.HashMap;
import java.util.Map;

public class Lol {
    Map<String,String> firstName = new HashMap<>();
    Map<String,String> midName = new HashMap<>();
    Map<String,String> lastName = new HashMap<>();

    public Lol() {
        firstName = new HashMap<>();
        firstName.put("ㄱ","소환사의 협곡에서");
        firstName.put("ㄴ","탑 라인에서");
        firstName.put("ㄷ","우물 안에서");
        firstName.put("ㄹ","레오나 집에서");
        firstName.put("ㅁ","봇 라인에서");
        firstName.put("ㅂ","칼바람 나락에서");
        firstName.put("ㅅ","미드 라인에서");
        firstName.put("ㅇ","PC방에서");
        firstName.put("ㅈ","억제기 앞에서");
        firstName.put("ㅊ","U.R.F 모드에서");
        firstName.put("ㅋ","자운에서");
        firstName.put("ㅌ","자기 집에서");
        firstName.put("ㅍ","정글 한복판에서");
        firstName.put("ㅎ","판테온 빵집에서");

        midName = new HashMap<>();
        midName.put("ㄱ","갱승을 당하는");
        midName.put("ㄴ","벽 점멸을 쓰는");
        midName.put("ㄷ","팀을 홀로 캐리하는");
        midName.put("ㄹ","허공에 궁극기를 쓰는");
        midName.put("ㅁ","신발을 여섯 개 사는");
        midName.put("ㅂ","미쳐 날뛰고 있는");
        midName.put("ㅅ","팀원에게 욕을 먹는");
        midName.put("ㅇ","환상적인 컨트롤의");
        midName.put("ㅈ","앞 구르기를 하는");
        midName.put("ㅊ","적을 학살중인");
        midName.put("ㅋ","펜타킬을 따내는");
        midName.put("ㅌ","정글 몹에게 죽는");
        midName.put("ㅍ","리폿을 당하는");
        midName.put("ㅎ","적을 압도하는");

        lastName = new HashMap<>();
        lastName.put("ㄱ","브론즈");
        lastName.put("ㄴ","손 잭스");
        lastName.put("ㄷ","챌린저");
        lastName.put("ㄹ","페이커");
        lastName.put("ㅁ","눈 리신");
        lastName.put("ㅂ","마스터 티어");
        lastName.put("ㅅ","트롤");
        lastName.put("ㅇ","바보");
        lastName.put("ㅈ","장인");
        lastName.put("ㅊ","뇌 문도");
        lastName.put("ㅋ","프로게이머");
        lastName.put("ㅌ","다이아 티어");
        lastName.put("ㅍ","매드라이프");
        lastName.put("ㅎ","언랭");

    }

    public String getName(String first, String mid, String last){
        String fName = firstName.get(first);
        String mName = midName.get(mid);
        String lName = lastName.get(last);

        String fullName = fName + " " + mName + " " + lName;

        return fullName;
    }





}
