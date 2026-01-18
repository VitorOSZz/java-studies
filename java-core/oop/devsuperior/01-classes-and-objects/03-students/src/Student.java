public class Student {

    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;


    public double totalGrade() {
        return (firstGrade+secondGrade+thirdGrade);
    }

    @Override
    public String toString() {
        return (totalGrade() >= 60)? "Pass" : "failed " + (60-totalGrade()) + " missing";
    }
}
