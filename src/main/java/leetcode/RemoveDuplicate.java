package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int pos=1;
        int current=1;
        int i=0;
        int done=0;
        while(current<nums.length){

            if(nums[i]!=nums[current]){
                nums[pos] = nums[current];
                pos++;
                done=0;
                i=current;
            }else if(done==0){
                done++;
                if(nums[pos]!=nums[i]){
                    nums[pos] = nums[current];
                }
                pos++;
            }
            current++;
        }
        System.out.println(pos);
        System.out.println(Arrays.toString(nums));
    }
}
