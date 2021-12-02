package AdvertisementMessage;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" ));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" ));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" ));

        Random phrase = new Random();
        Random event = new Random();
        Random author = new Random();
        Random city = new Random();

        for (int i = 0; i < n; i++) {

            String phraseMessage = phrases.remove(phrase.nextInt(phrases.size()));
            String eventMessage = events.remove(phrase.nextInt(phrases.size()));
            String authorMessage = authors.remove(phrase.nextInt(phrases.size()));
            String cityMessage = cities.remove(phrase.nextInt(phrases.size()));

            System.out.println(phraseMessage +  eventMessage +  authorMessage +  " – " + cityMessage);
        }

    }
}
