package Miscellenious;

import java.util.*;

public class BasicEncoding {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int freq = sc.nextInt();
            int num = sc.nextInt();

            countMap.put(num, countMap.getOrDefault(num, 0) + freq);
        }

        Map<Integer, List<Integer>> freqMap = new HashMap<>();

        for (Integer num : countMap.keySet()) {
            Integer freq = countMap.get(num);

            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new ArrayList<>());
            }

            freqMap.get(freq).add(num);
        }

        int highestFreq = Collections.max(freqMap.keySet());
        int lowestFreq = Collections.min(freqMap.keySet());

        int highestFreqNumber = Collections.max(freqMap.get(highestFreq));
        int lowestFreqNumber = Collections.min(freqMap.get(lowestFreq));

        int result = 0;

        if(countMap.size() == 1) {
            result = 0;
        }else {
            result = Math.abs(highestFreqNumber - lowestFreqNumber);
        }
        System.out.println(result);
        sc.close();
    }
}
