abstract class TaxPayer {

    String name;
    long annualIncome;

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = (long) (annualIncome*1000);
    }

    abstract long tax();

    @Override
    public String toString() {
        return this.name + ": $ " + (this.tax() / 1000.00);
    }
}
