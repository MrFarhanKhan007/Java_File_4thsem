import java.rmi.StubNotFoundException;

class student{
    public String name;
    public int roll_Number;
    public  int section;
    student(String name,int roll_Number,int section){
        this.name=name;
        this.roll_Number=roll_Number;
        this.section=section;
    }

}
class Exam extends student{
    int no_of_exams_given;
    Exam(String name,int roll_Number,int section,int no_of_exams_given){
        super(name,roll_Number,section);
        this.no_of_exams_given=no_of_exams_given;
    }
}
class Result extends Exam{
    public double grades;
    Result(String name,int roll_Number,int section,double grades,int no_of_exams_given){
        super(name,roll_Number,section,no_of_exams_given);
        this.grades=grades;
        this.no_of_exams_given=no_of_exams_given;
    }
    public void print(){
        System.out.println("Student's Name: "+name);
        System.out.println("Student's Roll Number: "+roll_Number);
        System.out.println("Student's section: "+section);
        System.out.println("Student's grades: "+grades);
        System.out.println("Number of Exams given: "+no_of_exams_given);
    }
}

public class Experiment8 {
    public static void main(String[] args) {
        Result r1=new Result("Farhan",537,9,  8.93,6);
        r1.print();
    }
}
