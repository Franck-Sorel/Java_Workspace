import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionnary {
    public static void main(String[] args) {

        String filePath = args[0]; // Path to your file
        String targetWord = args[1]; // Word to search for
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words (basic split on non-word characters)
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
}