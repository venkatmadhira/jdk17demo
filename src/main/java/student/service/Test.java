package student.service;

import student.model.Student;
import student.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        StudentService service = new StudentService();

        Subject sub1 = new Subject();
        sub1.name = "Telugu";
        sub1.marks = 36;

        Subject sub2 = new Subject();
        sub2.name = "Hindi";
        sub2.marks = 36;

        Subject sub3 = new Subject();
        sub3.name = "English";
        sub3.marks = 36;

        Subject sub4 = new Subject();
        sub4.name = "Maths";
        sub4.marks = 36;

        Subject sub5 = new Subject();
        sub5.name = "Science";
        sub5.marks = 36;

        Subject sub6 = new Subject();
        sub6.name = "Social";
        sub6.marks = 31;

        student.rollNo = "123456";
        student.name = "Venkat";
        student.schoolName = "Neo";
        student.subjects = new Subject[]{sub1, sub2, sub3, sub4, sub5, sub6};

        String validateMarks = service.validate(student);
        System.out.println(validateMarks);
    }
}
