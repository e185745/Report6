import ap.ac.uryukyu.ie.k225785.*;


public class Main{
    public static void main(String[] args){
        Student ooshiro = new Student("大城", "225761");
        Student sato = new Student("佐藤", "225701");
        Student suzuki = new Student("鈴木", "225702");
        Student[] sttend_list = {ooshiro,sato,suzuki};
        Attend teacher = new Attend(sttend_list);

        for(int i = 0; i < teacher.getLesson_number(); i++){
            teacher.clear_absence();
            teacher.attendance_for_day();
            teacher.add_absence();
        }
        System.out.println(ooshiro.getAbsence_number());


    }
}