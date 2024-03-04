package Firs_Partial_Project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UploadTXT upload = new UploadTXT();

        String text1 = upload.readFile();
        String text2 = upload.readFile();

        double similarity = VerifySimilarity.calculateSimilarity(text1, text2);
        List<String> misspellings = VerifySimilarity.findMisspellings(text1, text2);

        System.out.printf("Similarity: %.2f%%\n", similarity);
        System.out.println("\nMisspellings:\n");
        for (String misspelling : misspellings) {
            System.out.println(misspelling);
        }


    }
}
