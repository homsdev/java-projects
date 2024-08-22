package schoolExample;

import schoolExample.model.Course;
import schoolExample.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainSchoolExample {

    public void experimentWithStudents() {
        Teacher teacher = new Teacher("John");
        teacher.setId(UUID.randomUUID().toString());
        teacher.setName("John");
        teacher.setLastName("Doe");
        teacher.setEmail("john.doe@mail.com");
        teacher.setSubject("Math");

        Course course = new Course();
        course.setDescription("Course of introduction to math");
        course.setCode("AA001");
        course.setTitle("Introduction to Math");
        course.setTeacher(teacher);

        List<String> students = new ArrayList<>();

        students.add("Oscar");
        students.add("Mau");
        students.add("Gris");
        students.add("Maria");
        students.add("Kim");
        students.add("Mau");

        course.setStudents(students);

        System.out.println("Initial Course students");
        students.forEach(System.out::println);

        System.out.printf("\nAdding a new student in position: %d\n", students.size());
        System.out.printf("Students in course: %d\n", students.size());
        students.add(students.size(), "Alex");
        students.forEach(System.out::println);

        System.out.println("\nRemoving Mau:");
        students.remove("Mau");

        students.forEach(System.out::println);

        System.out.println(course.getDescription());
    }

    public void test_teachers(){
        List<Teacher> teachers = new ArrayList<>();
        Teacher sam = new Teacher("Sam");
        teachers.add(new Teacher("Sam"));
        teachers.add(new Teacher("John"));
        teachers.add(new Teacher("Louis"));
        teachers.add(new Teacher("Sam"));
        teachers.add(new Teacher("Claire"));
        teachers.add(sam);
        teachers.add(sam);

        teachers.remove(sam);

        teachers.forEach(System.out::println);
        System.out.println("\nRemoving Sam again");

        teachers.remove(sam);
        teachers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        st.append(true);
        Boolean flag = false;
        st.append(flag);
        st.append(0.5F);
        System.out.println(st);
    }
}
