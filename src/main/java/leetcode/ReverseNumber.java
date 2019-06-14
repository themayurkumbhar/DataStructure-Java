package leetcode;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int area=0,l=0;
        int r = height.length-1;
        while(l<r){

            area = Math.max(area,Math.min(height[l],height[r])*(r-l));
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        System.out.println(area);

        String query = "piyush";

        System.out.println(query.substring(0,2));
    }
}
