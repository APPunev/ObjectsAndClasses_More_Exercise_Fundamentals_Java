package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            Person person = new Person(name,age);

            if (person.getAge()>30) {
                people.add(person);
            }
        }

        people.sort(Comparator.comparing(Person::getName));
        for (Person element:people) {
            System.out.println(element.getName() + " - " + element.getAge());
        }

    }
}
