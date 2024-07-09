package Arrays4;


/*
* Given arr[n] with +ve elements, find majority element(an element with frequency > n/2)
*
* */

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,6,1,1};
        majorityElementBrute(arr);
    }

    private static void majorityElementBrute(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }else {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
            }
        }

        int result = 0;
        for(int key : map.keySet()) {
            if(map.get(key) > arr.length/2) {
                result = key;
            }
        }
        System.out.println(result);
    }
}
