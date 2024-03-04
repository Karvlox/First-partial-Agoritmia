package Firs_Partial_Project;


import java.util.ArrayList;
import java.util.List;

public class VerifySimilarity {

    public static double calculateSimilarity(String text1, String text2) {
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        String[] words1 = text1.split("\\s+");
        String[] words2 = text2.split("\\s+");

        int[][] dp = new int[words1.length + 1][words2.length + 1];
        for (int i = 1; i <= words1.length; i++) {
            for (int j = 1; j <= words2.length; j++) {
                if (words1[i - 1].equals(words2[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lcsLength = dp[words1.length][words2.length];
        int totalWords = words2.length;


        return (double) lcsLength / totalWords * 100;
    }



    public static List<String> findMisspellings(String text1, String text2) {
        List<String> misspellings = new ArrayList<>();

        String[] words1 = text1.split("\\s+");
        String[] words2 = text2.split("\\s+");

        for (String word : words2) {
            boolean found = false;
            for (String compareWord : words1) {
                if (calculateSimilarity(word, compareWord) >= 98) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                misspellings.add(word);
            }
        }

        return misspellings;
    }
}
