package domain;

import java.util.HashMap;
import java.util.Map;

public class Psychopass {
    Map<String,String> firstName = new HashMap<>();
    Map<String,String> midName = new HashMap<>();
    Map<String,String> lastName = new HashMap<>();
    public Psychopass() {

        firstName = new HashMap<>();
        firstName.put("ㄱ","아직도");
        firstName.put("ㄴ","혼자서");
        firstName.put("ㄷ","웃으며");
        firstName.put("ㄹ","집요하게");
        firstName.put("ㅁ","사악하게");
        firstName.put("ㅂ","비만오면");
        firstName.put("ㅅ","학교에서");
        firstName.put("ㅇ","남모르게");
        firstName.put("ㅈ","태연하게");
        firstName.put("ㅊ","조용히");
        firstName.put("ㅋ","미친듯이");
        firstName.put("ㅌ","아침에도");
        firstName.put("ㅍ","더럽게");
        firstName.put("ㅎ","날마다");

        midName = new HashMap<>();
        midName.put("ㄱ","죽이는");
        midName.put("ㄴ","도망치는");
        midName.put("ㄷ","살아있는");
        midName.put("ㄹ","찌르는");
        midName.put("ㅁ","칼을 가는");
        midName.put("ㅂ","덮치는");
        midName.put("ㅅ","흉기를 든");
        midName.put("ㅇ","숨어있는");
        midName.put("ㅈ","따라오는");
        midName.put("ㅊ","준비하는");
        midName.put("ㅋ","옆에있는");
        midName.put("ㅌ","자르는");
        midName.put("ㅍ","붙잡힌");
        midName.put("ㅎ","때리는");

        lastName = new HashMap<>();
        lastName.put("ㄱ","형사과장");
        lastName.put("ㄴ","옆집사람");
        lastName.put("ㄷ","선생님");
        lastName.put("ㄹ","직장상사");
        lastName.put("ㅁ","미친여자");
        lastName.put("ㅂ","부랑자");
        lastName.put("ㅅ","고등학생");
        lastName.put("ㅇ","연쇄살인범");
        lastName.put("ㅈ","너의 친구");
        lastName.put("ㅊ","바리스타");
        lastName.put("ㅋ","의사");
        lastName.put("ㅌ","피해자");
        lastName.put("ㅍ","연예인");
        lastName.put("ㅎ","수위아저씨");

    }
    public String getName(String first, String mid, String last){
        String fName = firstName.get(first);
        String mName = midName.get(mid);
        String lName = lastName.get(last);

        String fullName = fName + " " + mName + " " + lName;

        return fullName;
    }




}








