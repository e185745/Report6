package ap.ac.uryukyu.ie.k225785;

public class Student{
    private String name;
    private String number;
    private int absence_number = 0;
    private boolean absence = false;
    private boolean score = true;

    public Student(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){return this.name;}
    public String getNumber(){return this.number;}
    public int getAbsence_number(){return this.absence_number;}
    public void setAbsence_number(int absence_number){this.absence_number = absence_number;}
    public boolean getAbsence(){return this.absence;}
    public void setAbsence(boolean bool){this.absence = bool;}
    public boolean getScore(){return this.score;}
    public void setScore(boolean bool){this.score = bool;}
}