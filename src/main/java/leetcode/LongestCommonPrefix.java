package leetcode;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String [] a =new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        System.out.println(result(a));
    }

    private static String result(String [] strs){

        String query = strs[0];
        int l=0,r=1;
        String result = "";
        int stop = 0;
        while(r<=query.length()){
            String temp = query.substring(l,r);
            for(String str:strs){
                if(str.startsWith(temp)){
                }else{
                    stop = 1;
                    break;
                }
            }
            if(stop==1){
                break;
            }else{
                result = temp;
            }
            r++;
        }
        return result;
    }
}
