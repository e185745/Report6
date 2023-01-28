package ap.ac.uryukyu.ie.k225785;

//import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Attend{
    Student[] All_student;
    Map<String,Student> All_student_dict = new HashMap<>();
    private int lesson_number = 5;

    public Attend(Student[] all_student){
        this.All_student = all_student;
        for(int i = 0;i < all_student.length; i++){
            this.All_student_dict.put(all_student[i].getNumber(), all_student[i]);
        }
    }

    public int getLesson_number(){
        return lesson_number;
    }

    public void clear_absence(){
        for(int i = 0; i < All_student.length; i++){
            All_student[i].setAbsence(false);
        }
    }

    public void attendance_for_day(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("学籍番号を提示してください");
            String student_num = scanner.nextLine();
            if(student_num.equals("q")){break;}
            All_student_dict.get(student_num).setAbsence(true);
        }
        
    }

    public void judge_F(Student evalated_student){
        if(evalated_student.getAbsence_number() >= lesson_number / 3){
            if(evalated_student.getScore()){
                System.out.printf("%sさんは、授業数の1/3欠席したため、不可となりました。\n",evalated_student.getName());
            }
            evalated_student.setScore(false);
        }
    }

    public void add_absence(){
        for(Student s : this.All_student){
            if (s.getAbsence() == false){
                s.setAbsence_number(s.getAbsence_number() + 1);
                judge_F(s);
            }
        }   
    }
}

