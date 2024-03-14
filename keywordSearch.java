import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedWriter;

public class keywordSearch {
    public static void main(String[] args) {
        // Read keywords from keywords.txt
        BufferedWriter write = null;

        Set<String> keywords = new HashSet<>(); //Set does not allow duplicate elements. When you add elements to a HashSet, any duplicates are automatically ignored
        try (BufferedReader br = new BufferedReader(new FileReader("keywords.txt"))) {
            write = new BufferedWriter(new FileWriter("advertisement.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                keywords.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Search for keywords in reviews.csv
        
        try (BufferedReader br = new BufferedReader(new FileReader("reviews.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String reviewer = parts[0];
                String reviewText = parts[1];
                int rating = calculateSuitabilityRating(reviewText, keywords);
                String ad = " ";

    
                // Check if any keyword is present in the review text
                for (String keyword : keywords) {
                    if (reviewText.toLowerCase().contains(keyword.toLowerCase())) {
                        if (rating >= 3) {
                            ad = "Introducing the Symphony Series headphones from Aurora Audio, where premium sound meets ultimate comfort. Crafted with precision and designed for the discerning listener, our headphones deliver an immersive audio experience like no other. With crystal-clear sound, luxurious comfort, and sleek design, the Symphony Series headphones are the perfect companion for music enthusiasts and audiophiles alike. Featuring advanced active noise cancellation, wireless connectivity, long-lasting battery life, and built-in microphone, our headphones offer unparalleled convenience and versatility. Elevate your listening experience and immerse yourself in the symphony of sound with the Symphony Series headphones from Aurora Audio";
                            write.write("Reviewer: " + parts[0] + "\n");
                            write.write("Ad: " + ad + "\n\n");
                        } else if (rating >= 1) {
                            ad = "Discover a new dimension of sound with our cutting-edge earphones engineered for unparalleled performance. Designed with precision and crafted for comfort, our earphones deliver crystal-clear audio and immersive bass that will transport you to the heart of your music. Whether you're on the go or relaxing at home, our earphones offer the perfect blend of style, comfort, and functionality. With advanced noise-cancellation technology, wireless connectivity, and long-lasting battery life, you can enjoy uninterrupted listening pleasure wherever you go. Elevate your audio experience and immerse yourself in every beat with our premium earphones.";
                            write.write("Reviewer: " + parts[0] + "\n");
                            write.write("Ad: " + ad + "\n\n");
                        } else {
                            ad = "no ad!"; // No ad if suitability rating is between 1 and 3
                        }
                        // Print the review along with some context
                
                        // Break out of the loop after finding the first keyword in the review
                        break;
                    }
                }

               
            }
            write.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int calculateSuitabilityRating(String reviewText, Set<String> keywords) {
        int rating = 0;
        for (String keyword : keywords) {
            if (reviewText.toLowerCase().contains(keyword.toLowerCase())) {
                rating++; // Increment rating for each matched keyword
            }
        }
        return rating;
    }
}


