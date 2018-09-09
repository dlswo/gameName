package src.domain;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractGame {

    Map<String,String> firstName = new HashMap<>();
    Map<String,String> midName = new HashMap<>();
    Map<String,String> lastName = new HashMap<>();


    public String getName(String first, String mid, String last){
        String fName = firstName.get(first);
        String mName = midName.get(mid);
        String lName = lastName.get(last);

        String fullName = fName + " " + mName + " " + lName;

        return fullName;
    }
}
