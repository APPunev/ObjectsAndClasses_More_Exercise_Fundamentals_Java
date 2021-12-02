package Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleData = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Articles article = new Articles(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            String tokenForModification = input[1];

            switch (command){
                case "Edit":
                    article.edit(tokenForModification);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(tokenForModification);
                    break;
                case "Rename":
                    article.rename(tokenForModification);
                    break;

            }
        }
        System.out.println(article.toString());
    }

}
