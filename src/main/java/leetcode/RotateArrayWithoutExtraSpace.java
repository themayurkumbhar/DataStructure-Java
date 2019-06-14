package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayWithoutExtraSpace {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int q = sc.nextInt();
        q=q%n;
        while(q-->0){
            int temp = a[0];
            for(int i=0;i<n-1;i++){
                 a[i]=a[i+1];
            }
            a[n-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
