package Article20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articlesList = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String[] articles = scanner.nextLine().split(", ");
            //{title}, {content}, {author}
            String title = articles[0];
            String content = articles[1];
            String author = articles[2];

            Article article = new Article(title,content,author);
            articlesList.add(article);
        }

        String sortBy = scanner.nextLine();

        switch (sortBy){
            case "title":
                articlesList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articlesList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articlesList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        articlesList.forEach(el -> System.out.println(el));
    }
}
