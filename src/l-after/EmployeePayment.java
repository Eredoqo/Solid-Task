package l.after;

public class EmployeePayment {
    public String firstName;
    public String lastName;
    public double salary;
    public double baseAmount;
    public double rankRate;

    public EmployeePayment(double baseAmount, double rankRate) {
        this.baseAmount = 12.50;
        this.rankRate = 2.0;
    }

    public void calculatePerHourRate(int rank) {
        salary = baseAmount + (rank * rankRate);
    }
}
