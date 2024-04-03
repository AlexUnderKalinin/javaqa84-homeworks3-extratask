
public class Creditcalcservice {

    double annualRate = 9.99;
    double interestRate = annualRate / 12 / 100;
    double a = (1 + interestRate);

    double pow(double a, double creditTerm) {
        int result = (int) Math.pow(a, creditTerm);
        return result;
    }

    public int payment(int sum, int creditTerm) {
        int result;
        result = (int) (sum * interestRate * a / (a - 1));
        return result;
    }
}