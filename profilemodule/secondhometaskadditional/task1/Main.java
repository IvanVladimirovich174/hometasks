package profilemodule.secondhometaskadditional.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day"};

        System.out.println(Arrays.toString(getTheMostCommon(words, 4)));
    }

    public static String[] getTheMostCommon(String[] words, int k) {
        Map<String, Integer> wordsCountMap = new HashMap<>();

        for (String word : words) {
            wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordsCountMap.entrySet());

        Comparator<Map.Entry<String, Integer>> comparatorByValue = new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Comparator<Map.Entry<String, Integer>> comparatorByKey = new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };

        entryList.sort(comparatorByValue.thenComparing(comparatorByKey).reversed());

        String[] stringsResult;
        if (k <= entryList.size()) {
            stringsResult = new String[k];
            for (int i = 0; i < k; i++) {
                stringsResult[i] = entryList.get(i).getKey();
            }
        } else {
            stringsResult = new String[entryList.size()];
            for (int i = 0; i < entryList.size(); i++) {
                stringsResult[i] = entryList.get(i).getKey();
            }
        }
        return stringsResult;
    }
}

