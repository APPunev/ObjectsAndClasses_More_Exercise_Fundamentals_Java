import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email = "";
            int age = 0;
            if (input.length < 6) {
                try {
                    age = Integer.parseInt(input[4]);
                }catch (NumberFormatException e){
                    email = input[4];
                }
            }
            Employee person = new Employee(name, salary, position, department, email, age);
            employeeList.add(person);
        }
    }
}
