package Package2;

import Package1.Student;

public class ResultUse {
    public static void main(String[] args) {
        Result R_Farhan = new Result("Farhan", 537, "CSE9x");

        R_Farhan.TotalMarks(100, 88, 93, 97,
                87, 90, 93, 91);
        R_Farhan.AverageMarks();
        R_Farhan.DisplayDetails();
    }
}
