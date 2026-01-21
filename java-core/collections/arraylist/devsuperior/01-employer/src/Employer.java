public class Employer {

    private int id;
    private String name;
    private double salary;

    public Employer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    // Methods

    public void increaseSalary(double percent) {
        salary *= 1+(percent/100);
    }
}
