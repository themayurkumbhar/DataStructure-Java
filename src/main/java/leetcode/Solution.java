package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        Map<Integer,Integer> count = new HashMap<>();
        for (int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(count.containsKey(temp)){
                int cnt = count.get(temp);
                count.put(temp,++cnt);
            }else{
                count.put(temp,1);
            }
        }
        int max = 0;
        int maxNum = -1;
        for (Map.Entry entry:count.entrySet()){

            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if(value==max){
                if(key<maxNum){
                    maxNum = key;
                }
            }
            if(value>max){
                max=value;
                maxNum = key;
            }
        }
        System.out.println(maxNum);
    }
}
