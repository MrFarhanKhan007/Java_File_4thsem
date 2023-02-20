package Package2;

public class Result extends Marks {
    protected double total_marks;
    protected double average_marks;
    Result(String name, int roll_Number, String section) {
        super(name, roll_Number, section);
    }
    public void TotalMarks(
            double Marks_in_JAVA,
    double Marks_in_AppliedMathematics_IV,
    double Marks_in_DiscreteMathematics,
    double Marks_in_BehaviouralScience,
    double Marks_in_OperatingSystem,
    double Marks_in_TheoryOfComputation,
    double Marks_in_BasicSimulationLab,
    double Marks_in_FBL) {
        total_marks = Marks_in_JAVA + Marks_in_AppliedMathematics_IV + Marks_in_DiscreteMathematics + Marks_in_BehaviouralScience +
                Marks_in_OperatingSystem + Marks_in_TheoryOfComputation + Marks_in_BasicSimulationLab + Marks_in_FBL;
    }

    public void AverageMarks() {
        average_marks = total_marks / 8;
    }


    public void DisplayDetails() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll Number of the Student: " + roll_Number);
        System.out.println("Section of the Student: " + section);
        System.out.println("Total Marks: " + total_marks+ "/800");
        System.out.println("Average Marks: " + average_marks+"/100.00");
    }
}
