package ap.ac.uryukyu.ie.k225785;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AttendTest {
    @Test void test_add_absence() {
        Student DemoStudent = new Student("大城", "225761");
        Student[] DemoList = {DemoStudent};
        Attend teacher = new Attend(DemoList);
        teacher.add_absence();
        System.out.println(DemoStudent.getAbsence_number());
        assertEquals(1,DemoStudent.getAbsence_number());
    }
}