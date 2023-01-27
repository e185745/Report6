package ap.ac.uryukyu.ie.k225785;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AttendTest {
    @Test void test_add_absence() {
        Student DemoStudent = new Student("大城", "225761");
        System.out.println(DemoStudent.getNumber());
        Attend teacher = new Attend();
        teacher.add_absence(DemoStudent);
        System.out.println(DemoStudent.getAbsence());
        assertEquals(1,DemoStudent.getAbsence());
    }
}