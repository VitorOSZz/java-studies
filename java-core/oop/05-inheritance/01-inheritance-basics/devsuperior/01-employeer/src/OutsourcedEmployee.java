public class OutsourcedEmployee extends Employee {

    private final long additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = (long) (additionalCharge * 1000.00);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder(super.toString());
        text.deleteCharAt(text.length()-1);
        text.append(", additionalCharge=").append(String.format("%.2f", additionalCharge/1000.00)).append("}");
        return String.valueOf(text);
    }

    @Override
    public long payment() {
        long payment = super.payment();
        return (long) (payment + (this.additionalCharge*1.10));
    }
}
