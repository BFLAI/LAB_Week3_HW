public class WeightGrades {
    private double[] Assignments; //variable parts
    private double[] Percentages;
    private double[] WeightedGrade;

    public void setTotalAssignments(double Assignments[]) { //set the Assignments part
        this.Assignments = Assignments;
    }

    public void setTotalPercentages(double Percentages[]) { //set the percentages part
        this.Percentages = Percentages;
    }

    public void setTotalWeightedGrade(double WeightedGrade[]) { //set the WeightedGrade part
        this.WeightedGrade = WeightedGrade;
    }

    public double TotalGrade() { //The way to calculate the Total Grade
        double total = 0;
        double num;
        for(int i=0 ; i<Assignments.length; i++){
            num=WeightedGrade[i]/Assignments[i]*Percentages[i];
            total += num;
        }
        return total;
    }
}
