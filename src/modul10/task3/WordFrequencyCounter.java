package modul10.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        File fileName = new File("words.txt");
        Map<String, Integer> wordFrequencyMap = countWordFrequency(fileName);
        printSortedWordFrequency(wordFrequencyMap);
    }

    public static Map<String, Integer> countWordFrequency(File fileName) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordFrequencyMap;
    }
    public static void printSortedWordFrequency(Map<String, Integer> wordFrequencyMap) {

        List<Map.Entry<String, Integer>> wordFrequencyList = new ArrayList<>(wordFrequencyMap.entrySet());
        Collections.sort(wordFrequencyList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : wordFrequencyList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

