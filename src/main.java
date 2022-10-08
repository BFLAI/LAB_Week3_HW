import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Input object
        WeightGrades number = new WeightGrades(); //WeightGrades object

        double[] Assignments = new double[8];

        System.out.println("Assignments Number: "); //Input Assignments number
        for (int i = 0; i < Assignments.length; i++) {
            Assignments[i] = input.nextDouble();
        }

        number.setTotalAssignments(Assignments);

        double[] Percentages = new double[8];

        System.out.println("Total Percentages: "); //Input Percentages number
        for (int i = 0; i < Percentages.length; i++) {
            Percentages[i] = input.nextDouble();
        }

        number.setTotalPercentages(Percentages);

        double[] WeightedGrade = new double[8];

        System.out.println("Total WeightedGrade: "); //Input Total WeightedGrade number
        for (int i = 0; i < WeightedGrade.length; i++) {
            WeightedGrade[i] = input.nextDouble();
        }

        number.setTotalWeightedGrade(WeightedGrade);

        double Weighted = number.TotalGrade();

        if (100 >= Weighted && Weighted >= 90) { //calculate the Grade range
            System.out.println("Grade: A");

        } else if (90 > Weighted && Weighted >= 80) {
            System.out.println("Grade: B");

        } else if (80 > Weighted && Weighted >= 70) {
            System.out.println("Grade: C");

        } else if (70 > Weighted && Weighted >= 60) {
            System.out.println("Grade: D");

        } else if (60 > Weighted && Weighted >= 0) {
            System.out.println("Grade: F");

        } else {
            System.out.println("Wrong input");
        }

        System.out.printf("%.3f", Weighted); //print WeightedGrade number
    }
}