
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Walmart {
    public static void main(String[] args) {
        try {
            List<Document> documents = new ArrayList<>();
            List<Elements> reviews = new ArrayList<>();

            Document doc = Jsoup.connect("https://www.walmart.com/reviews/product/386006068").get();
          
            documents.add(doc);

            Elements reviewers = doc.getElementsByClass("cc-3 cg-4 pl0 mt4");
            reviews.add(reviewers);

            BufferedWriter writer = new BufferedWriter(new FileWriter("reviews.csv"));
    
            for (Elements review : reviews) {
                for (int j = 0; j < 16; j++) {
                    String reviewer1 = review.select(".f6.gray.pr2.mb2").get(j).text();
                    String stars1 = review.select("span.w_iUH7").get(j).text();
                    String reviewText1 = review.select(".tl-m.mb3.db-m").get(j).text();
                    String date1 = review.select(".f7.gray.mt1").get(j).text();
                    String verified1 = review.select(".green.b.mr1").get(j).text().isEmpty() ? "Not Verified" : "Verified";
                    writer.append(reviewer1 + ", " + reviewText1 + ", " + stars1 + ", " + date1 + ", " + verified1 + "\n");
                    System.out.println(" ");
                }
              
        }


        writer.close();

        System.out.println("Scraping complete. All the reviews have been stored to the csv file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





