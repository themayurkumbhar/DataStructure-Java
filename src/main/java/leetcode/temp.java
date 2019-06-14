package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class temp {

    public static void main(String[] args) {

      List<String> strList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        HashMap<String,List<String>> map = new HashMap<>();
        strList.forEach(str->{

            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            if(map.containsKey(sortedStr)){

                List<String> strL = map.get(sortedStr);
                strL.add(str);
            }else{
                List<String> strL = new ArrayList<>();
                strL.add(str);
                map.put(sortedStr,strL);
            }
        });

        map.forEach((key,value)->System.out.println(value));

    }
}
