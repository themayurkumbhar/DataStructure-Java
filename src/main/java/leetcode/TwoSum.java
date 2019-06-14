package leetcode;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Queue<Integer>> valueToIndexMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(valueToIndexMap.containsKey(nums[i])){
                Queue<Integer> temp = valueToIndexMap.get(nums[i]);
                temp.offer(i);
            }else{
                Queue<Integer> temp = new LinkedList<>();
                temp.offer(i);
                valueToIndexMap.put(nums[i],temp);
            }
        }
        int k=0;
        int [] response = new int[2];
        for(Map.Entry<Integer,Queue<Integer>> entry:valueToIndexMap.entrySet()){

            int temp = target-entry.getKey();
            if(valueToIndexMap.containsKey(temp)){
                response[k++] = entry.getValue().poll();
                response[k++] = valueToIndexMap.get(temp).poll();
                break;
            }
        }

        System.out.println(response);
    }
}
