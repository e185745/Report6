package ap.ac.uryukyu.ie.k225785;

import java.util.ArrayList;
public class Attend {
    ArrayList student_list;
    /*
     * public Attend(ArrayList student_list){
        this.student_list = student_list;
    }
     */
    

    public void add_absence(Student absence_student){
        absence_student.setAbsence(absence_student.getAbsence() + 1);
    }
}

