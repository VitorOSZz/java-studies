public class Individual extends TaxPayer{

    private long healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = (long) (healthExpenditures*1000);
    }

    @Override
    long tax() {
        long tax = 0;
        if (this.annualIncome < 20_000 * 1000) {
            tax = (long) (this.annualIncome * 0.15);
        } else {
            tax = (long) (this.annualIncome * 0.25);
        }

        tax -= (long) (this.healthExpenditures * 0.50);

        return tax;
    }
}
