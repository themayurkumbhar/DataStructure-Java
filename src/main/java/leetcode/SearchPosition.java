package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SearchPosition {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int val = sc.nextInt();
        int i = 0;
        int j = nums.length-1;
        int count = (int) Arrays.stream(nums).filter(num->num==val).count();
        while(i<j){

            if(nums[i] == val){
                while(nums[j] == val){
                    j--;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            i++;
        }
        System.out.println(nums.length-count);
    }
}
