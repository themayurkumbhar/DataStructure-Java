package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] nums =new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int pos = selectPositionToReplace(nums);
        if(pos==-1){
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        else{
            int temp = n-pos-1;
            int tempPos = pos+1;
            int[] s= new int[temp];
            for(int i=0;i<s.length;i++){
                s[i]=nums[tempPos];
                tempPos++;
            }
            Arrays.sort(s);
            tempPos=pos+1;
            for(int i=0;i<s.length;i++){
                nums[tempPos] = s[i];
                tempPos++;
            }
            System.out.println(Arrays.toString(nums));
            for(int i=pos+1;i<nums.length;i++){
                if(nums[i]>nums[pos]){
                    temp = nums[pos];
                    nums[pos]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));
            return;
        }
    }

    private static int selectPositionToReplace(int[] a) {

        int n = a.length;
        int max = a[n-1];
        n--;
        int result = -1;
        while(--n>=0){

            if(max>a[n]){
                result = n;
                break;
            }else{
                max=a[n];
            }
        }
        return result;
    }
}
