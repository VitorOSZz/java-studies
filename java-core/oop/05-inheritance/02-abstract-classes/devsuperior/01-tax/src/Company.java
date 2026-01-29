public class Company  extends TaxPayer{

    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    long tax() {
        long tax = 0;

        if (numberOfEmployees > 10) {
            tax = (long) (this.annualIncome*0.14);
        } else {
            tax = (long) (this.annualIncome*0.16);
        }

        return tax;
    }
}
