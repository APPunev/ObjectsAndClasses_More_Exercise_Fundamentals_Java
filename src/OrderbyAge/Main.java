package OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] inputData = input.split("\\s+");
            String name = inputData[0];
            String ID = inputData[1];
            int age = Integer.parseInt(inputData[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);

        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person:personList) {
            System.out.println(person.toString());
        }
    }
}
