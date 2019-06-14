package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums =new int[n];
        int [] r = {-1,-1};
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int pos = Arrays.binarySearch(nums,target);
        if(pos<0){
            System.out.println(Arrays.toString(r));
        }else{
            int f = pos;
            int l = pos;
            for(int i=pos+1;i<nums.length;i++){
                if(nums[i]==nums[pos]){
                    l++;
                }
            }
            for(int i=pos-1;i>=0;i--){
                if(nums[i]==nums[pos]){
                    f--;
                }
            }
            System.out.println("["+f+","+l+"]");
        }
    }
}
