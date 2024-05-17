package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для реализации домашнего задания номер три, часть 1.
 */
public class Homework3_1 {

    /**
     * Реализовать метод который считает количество слов встречающихся в заданном тексте.
     * @param text - заданный текст
     * @return - словарь слов и количество их появлений в данном тексте
     */
    public Map<String,Integer> countWords(String text){
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\W+");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;

    }

    public static void main(String[] args) {
        Homework3_1 wc = new Homework3_1();
        String text = "This is, a \"test. This test: is only a test.";
        Map<String, Integer> result = wc.countWords(text);
        System.out.println(result);
    }
}
