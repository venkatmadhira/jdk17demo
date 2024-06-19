package student.service;
import student.model.Student;
import student.model.Subject;

public class StudentService {
    public static int passMarks = 35;

    public String validate(Student student) {
        for (Subject subject : student.subjects) {
            if (subject.marks < passMarks) {
                return "Failed";
            }
        }
        return "Passed";
    }
}
