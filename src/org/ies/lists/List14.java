package org.ies.lists;

import java.util.LinkedList;
import java.util.List;
import org.ies.lists.Student;

public class List14 {
    public static void main(String[] args) {
        Student student1 = new Student("rida", "rida@gmail.com");
        Student student2 = new Student("juan", "juan@gmail.com");
        List<Student> studentList = new LinkedList<>();
        studentList.add(student1);
        studentList.add(student2);
        List<String> emails = mapToEmails(studentList);
        System.out.println(emails);
    }

    public static List<String> mapToEmails(List<Student> students) {
        List<String> emails = new LinkedList<>();
        for (var result: students) {
            emails.add(result.getEmail());
        }
        return emails;
    }
}
