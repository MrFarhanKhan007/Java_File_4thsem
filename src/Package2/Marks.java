package Package2;

import Package1.Student;

public class Marks extends Student {
   protected double Marks_in_JAVA;
    protected double Marks_in_AppliedMathematics_IV;
    protected double Marks_in_DiscreteMathematics;
    protected double Marks_in_BehaviouralScience;
    protected double Marks_in_OperatingSystem;
    protected double Marks_in_TheoryOfComputation;
    protected double Marks_in_BasicSimulationLab;
    protected double Marks_in_FBL; //foreign business language

    Marks(String name, int roll_Number, String section) {
        super(name, roll_Number, section);
    }
}
