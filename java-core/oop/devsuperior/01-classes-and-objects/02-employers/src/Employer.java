public class Employer {

    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return (grossSalary-tax);
    }

    public void increaseSalary(double percentage) {
        grossSalary += (grossSalary * (0 + (percentage / 100)));
    }

    @Override
    public String toString() {
        return "Employer {" +
                "name='" + name + '\''  + ", " + netSalary() +
                '}';
    }
}
