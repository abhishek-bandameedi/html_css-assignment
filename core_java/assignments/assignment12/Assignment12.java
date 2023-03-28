package assignments.assignment12;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment12 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electrical", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("1. Departments in College");
        studentList.stream().map(student -> student.engDepartment).collect(Collectors.toSet()).forEach(Dep -> System.out.print("\t"+Dep+","));

        System.out.println("\n2. Students Enrolled after 2018");
        studentList.stream().filter(student->student.yearOfEnrollment>2018).forEach(student -> System.out.print("\t"+student.name+"\t"));

        System.out.println("\n3. All Male students in Computer Science");
        studentList.stream().filter(student -> student.gender == "Male" && student.engDepartment == "Computer Science").forEach(student -> System.out.println("\t"+student.getStudentDetails()));

        System.out.println("4. Number of Male and Female students");
        studentList.stream().collect(Collectors.groupingBy(Student::getGender)).forEach((gender,total) -> System.out.println("\t"+gender+" "+total.size()));

        System.out.println("5. Average age of male and female students");
        studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))).forEach((gender, average) -> System.out.println("\t"+gender+" "+average));

        System.out.println("6. Details of Student having the highest percentage");
        System.out.println("\t"+studentList.stream().max(Comparator.comparing(Student::getPerTillDate)).get().getStudentDetails());

        System.out.println("7. Count of no. of students in each department");
        studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment)).forEach((s, students) -> System.out.println("\t"+s+" - "+students.size()));

        System.out.println("8. Average percentage achieved in each department");
        studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))).forEach((department, percentageAverage) -> System.out.println("\t"+department+" - "+percentageAverage));

        System.out.println("9. Details of youngest male student in Electronic department");
        System.out.println("\t"+studentList.stream().filter(student -> student.gender.equals("Male") && student.engDepartment.equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Student::getAge))).get().getStudentDetails());

        System.out.println("10. No. of male and female students in computer science");
        studentList.stream().filter(student -> student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender)).forEach((gender, students) -> System.out.println("\t"+gender+" "+students.size()));
    }

}