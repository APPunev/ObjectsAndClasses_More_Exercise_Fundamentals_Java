package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String studentData = scanner.nextLine();
            String[] splitData = studentData.split("\\s+");
            String name = splitData[0];
            String lastName = splitData[1];
            double grade = Double.parseDouble(splitData[2]);

            Student student = new Student(name,lastName,grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(studentList);

        studentList.forEach(el -> System.out.println(el.toString()));
    }
}
