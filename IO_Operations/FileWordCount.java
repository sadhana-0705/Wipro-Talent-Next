import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileWordCount {
    public static void main(String[] args) {
        // 1. Check if both input and output files are provided via arguments
        if (args.length < 2) {
            System.out.println("Usage: java FileWordCount <inputFile.txt> <outputFile.txt>");
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        // 2. Use a TreeMap to automatically store keys in alphabetical order
        Map<String, Integer> wordCounts = new TreeMap<>();

        // 3. Read and process the input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split by spaces or punctuation tabs to isolate clean words
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    
                    // Keep original casing style as per assignment's sample output ('Wipro', 'works')
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // 4. Write sorted map results out to the designated output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word counting completed successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
