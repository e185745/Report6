package ap.ac.uryukyu.ie.k225785;

public class Main{
    public static void main(String[] args){
        Student ooshiro = new Student("大城", "225761");
        System.out.println(ooshiro.getNumber());
        Attend teacher = new Attend();
        teacher.add_absence(ooshiro);
        System.out.println(ooshiro.getAbsence());

    }
}