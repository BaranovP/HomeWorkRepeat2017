package HomeWork4;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract double getMonthlyRate();
    abstract double getCommission(int summ);
    double moneyPaidMonthlyForSalary(){
        return avrSalaryOfEmployee * numberOfEmployee;
    }


    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployee = numberOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public Bank(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}