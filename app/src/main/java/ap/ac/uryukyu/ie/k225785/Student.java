package ap.ac.uryukyu.ie.k225785;

public class Student{
    private String name;
    private String number;
    private int absence = 0;

    public Student(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){return this.name;}
    public String getNumber(){return this.number;}

    public int getAbsence(){return this.absence;}
    public void setAbsence(int absence_number){this.absence = absence_number;}
    
}