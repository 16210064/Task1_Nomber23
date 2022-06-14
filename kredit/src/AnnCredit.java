public class AnnCredit extends Credit{
    public AnnCredit(double money, double months, double percent) {
        super(money, months, percent, CreditType.ANN);
    }

    @Override
    public double Calculate(int month) {
        double i = percent / 12 / 100;
        return Math.floor((i * Math.pow(1 + i, months)) / (Math.pow(1 + i, months) - 1) * money * 100) / 100;
    }
}
