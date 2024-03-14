
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator.AllElements;

import src.parser;

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
            ArrayList<String> allReview =  new ArrayList<>();

            Document doc = Jsoup.connect("https://www.walmart.com/reviews/product/386006068").get();
          
            documents.add(doc);

            Elements reviewers = doc.getElementsByClass("cc-3 cg-4 pl0 mt4");
            reviews.add(reviewers);
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("reviews.csv"));

            for (Elements review : reviews) {
                
                String reviewer = review.select(".f6.gray.pr2.mb2").get(0).text();
                String stars = review.select("span.w_iUH7").get(0).text().replace("out of 5 stars review", "").trim();
                String reviewText = review.select(".tl-m.mb3.db-m").get(0).text();
                String date = review.select(".f7.gray.mt1").get(0).text();
                String verified = review.select(".green.b.mr1").get(0).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer + "," + reviewText + "," + stars + "," + date + "," + verified + "\n");

                String reviewer1 = review.select(".f6.gray.pr2.mb2").get(1).text();
                String stars1 = review.select("span.w_iUH7").get(1).text().replace("out of 5 stars review", "").trim();
                String reviewText1 = review.select(".tl-m.mb3.db-m").get(1).text();
                String date1 = review.select(".f7.gray.mt1").get(1).text();
                String verified1 = review.select(".green.b.mr1").get(1).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer1 + "," + reviewText1 + "," + stars1 + "," + date1 + "," + verified1 + "\n");

                String reviewer2 = review.select(".f6.gray.pr2.mb2").get(2).text();
                String stars2 = review.select("span.w_iUH7").get(2).text().replace("out of 5 stars review", "").trim();
                String reviewText2 = review.select(".tl-m.mb3.db-m").get(2).text();
                String date2 = review.select(".f7.gray.mt1").get(2).text();
                String verified2 = review.select(".green.b.mr1").get(2).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer2 + "," + reviewText2 + "," + stars2 + "," + date2 + "," + verified2 + "\n");

                String reviewer3 = review.select(".f6.gray.pr2.mb2").get(3).text();
                String stars3 = review.select("span.w_iUH7").get(3).text().replace("out of 5 stars review", "").trim();
                String reviewText3 = review.select(".tl-m.mb3.db-m").get(3).text();
                String date3 = review.select(".f7.gray.mt1").get(3).text();
                String verified3 = review.select(".green.b.mr1").get(3).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer3 + "," + reviewText3 + "," + stars3 + "," + date3 + "," + verified3 + "\n");

                String reviewer4 = review.select(".f6.gray.pr2.mb2").get(4).text();
                String stars4 = review.select("span.w_iUH7").get(4).text().replace("out of 5 stars review", "").trim();
                String reviewText4 = review.select(".tl-m.mb3.db-m").get(4).text();
                String date4 = review.select(".f7.gray.mt1").get(4).text();
                String verified4 = review.select(".green.b.mr1").get(4).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer4 + "," + reviewText4 + "," + stars4 + "," + date4 + "," + verified4 + "\n");

                String reviewer5 = review.select(".f6.gray.pr2.mb2").get(5).text();
                String stars5 = review.select("span.w_iUH7").get(5).text().replace("out of 5 stars review", "").trim();
                String reviewText5 = review.select(".tl-m.mb3.db-m").get(2).text();
                String date5 = review.select(".f7.gray.mt1").get(5).text();
                String verified5 = review.select(".green.b.mr1").get(5).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer5 + "," + reviewText5 + "," + stars5 + "," + date5 + "," + verified5 + "\n");

                String reviewer6 = review.select(".f6.gray.pr2.mb2").get(6).text();
                String stars6 = review.select("span.w_iUH7").get(6).text().replace("out of 5 stars review", "").trim();
                String reviewText6 = review.select(".tl-m.mb3.db-m").get(6).text();
                String date6 = review.select(".f7.gray.mt1").get(6).text();
                String verified6 = review.select(".green.b.mr1").get(6).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer6 + "," + reviewText6 + "," + stars6 + "," + date6 + "," + verified6 + "\n");

                String reviewer7 = review.select(".f6.gray.pr2.mb2").get(7).text();
                String stars7 = review.select("span.w_iUH7").get(7).text().replace("out of 5 stars review", "").trim();
                String reviewText7 = review.select(".tl-m.mb3.db-m").get(7).text();
                String date7 = review.select(".f7.gray.mt1").get(7).text();
                String verified7 = review.select(".green.b.mr1").get(7).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer7 + "," + reviewText7 + "," + stars7 + "," + date7 + "," + verified7 + "\n");

                String reviewer8 = review.select(".f6.gray.pr2.mb2").get(8).text();
                String stars8 = review.select("span.w_iUH7").get(8).text().replace("out of 5 stars review", "").trim();
                String reviewText8 = review.select(".tl-m.mb3.db-m").get(8).text();
                String date8 = review.select(".f7.gray.mt1").get(8).text();
                String verified8 = review.select(".green.b.mr1").get(8).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer8 + "," + reviewText8 + "," + stars8 + "," + date8 + "," + verified8 + "\n");

                String reviewer9 = review.select(".f6.gray.pr2.mb2").get(9).text();
                String stars9 = review.select("span.w_iUH7").get(9).text().replace("out of 5 stars review", "").trim();
                String reviewText9 = review.select(".tl-m.mb3.db-m").get(9).text();
                String date9 = review.select(".f7.gray.mt1").get(9).text();
                String verified9 = review.select(".green.b.mr1").get(9).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer9 + "," + reviewText9 + "," + stars9 + "," + date9 + "," + verified9 + "\n");

                String reviewer10 = review.select(".f6.gray.pr2.mb2").get(10).text();
                String stars10 = review.select("span.w_iUH7").get(10).text().replace("out of 5 stars review", "").trim();
                String reviewText10 = review.select(".tl-m.mb3.db-m").get(10).text();
                String date10 = review.select(".f7.gray.mt1").get(10).text();
                String verified10 = review.select(".green.b.mr1").get(10).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer10 + "," + reviewText10 + "," + stars10 + "," + date10 + "," + verified10 + "\n");

                String reviewer11 = review.select(".f6.gray.pr2.mb2").get(11).text();
                String stars11 = review.select("span.w_iUH7").get(11).text().replace("out of 5 stars review", "").trim();
                String reviewText11 = review.select(".tl-m.mb3.db-m").get(11).text();
                String date11 = review.select(".f7.gray.mt1").get(11).text();
                String verified11 = review.select(".green.b.mr1").get(11).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer11 + "," + reviewText11 + "," + stars11 + "," + date11 + "," + verified11 + "\n");

                String reviewer12 = review.select(".f6.gray.pr2.mb2").get(12).text();
                String stars12 = review.select("span.w_iUH7").get(12).text().replace("out of 5 stars review", "").trim();
                String reviewText12 = review.select(".tl-m.mb3.db-m").get(12).text();
                String date12 = review.select(".f7.gray.mt1").get(12).text();
                String verified12 = review.select(".green.b.mr1").get(12).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer12 + "," + reviewText12 + "," + stars12 + "," + date12 + "," + verified12 + "\n");

                String reviewer13 = review.select(".f6.gray.pr2.mb2").get(13).text();
                String stars13 = review.select("span.w_iUH7").get(13).text().replace("out of 5 stars review", "").trim();
                String reviewText13 = review.select(".tl-m.mb3.db-m").get(13).text();
                String date13 = review.select(".f7.gray.mt1").get(13).text();
                String verified13 = review.select(".green.b.mr1").get(13).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer13 + "," + reviewText13 + "," + stars13 + "," + date13 + "," + verified13 + "\n");

                String reviewer14 = review.select(".f6.gray.pr2.mb2").get(14).text();
                String stars14 = review.select("span.w_iUH7").get(14).text().replace("out of 5 stars review", "").trim();
                String reviewText14 = review.select(".tl-m.mb3.db-m").get(14).text();
                String date14 = review.select(".f7.gray.mt1").get(14).text();
                String verified14 = review.select(".green.b.mr1").get(14).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer14 + "," + reviewText14 + "," + stars14 + "," + date14 + "," + verified14 + "\n");

                String reviewer15 = review.select(".f6.gray.pr2.mb2").get(15).text();
                String stars15 = review.select("span.w_iUH7").get(15).text().replace("out of 5 stars review", "").trim();
                String reviewText15 = review.select(".tl-m.mb3.db-m").get(15).text();
                String date15 = review.select(".f7.gray.mt1").get(15).text();
                String verified15 = review.select(".green.b.mr1").get(15).text().isEmpty() ? "Not Verified" : "Verified";

                writer.append(reviewer15 + "," + reviewText15 + "," + stars15 + "," + date15 + "," + verified15 + "\n");
        
            }

            writer.close();

            System.out.println("Scraping complete. All the reviews have been stored to the csv file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





