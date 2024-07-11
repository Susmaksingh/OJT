/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
import java.util.*;

import java.util.*;

public class WordLadder {

    class WordNode {
        String word;
        int numSteps;

        public WordNode(String word, int numSteps) {
            this.word = word;
            this.numSteps = numSteps;
        }
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));
        wordDict.add(endWord);

        while (!queue.isEmpty()) {
            WordNode top = queue.remove();
            String word = top.word;

            if (word.equals(endWord)) {
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;
                    }

                    String newWord = new String(arr);
                    if (wordDict.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps + 1));
                        wordDict.remove(newWord);
                    }

                    arr[i] = temp;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        Set<String> wordDict = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        String beginWord = "App";
        String endWord = "cat";

        int length = wordLadder.ladderLength(beginWord, endWord, wordDict);
        System.out.println("Length of shortest transformation sequence: " + length);
        
    }
}

