public class Employee {

    private String name;
    private int hours;
    private long valuePerHour;

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = (long) (valuePerHour * 1000);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", valuePerHour=" + String.format("%.2f", (valuePerHour / 1000.00)) +
                ", payment=" + String.format("%.2f", (this.payment() / 1000.00)) +
                '}';
    }

    public long payment() {
        return this.hours * this.valuePerHour;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public long getValuePerHour() {
        return valuePerHour;
    }
}
