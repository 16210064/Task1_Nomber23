public class DiffCredit extends Credit{

    public DiffCredit(double money, double months, double percent) {
        super(money, months, percent, CreditType.DIFF);
    }

    @Override
    public double Calculate(int month) {
        double MainPayment = money / months;
        double SumCredit = money;
        double InterestRateMonth = percent / 100 / 12;
        double val = 0;
        for (int i = 0; i < month; ++i)
        {
            double procentPart = SumCredit * InterestRateMonth; //подсчет процентной части ежемесячного платежа
            SumCredit -= MainPayment; //подсчет остатка основного долга (с каждым месяцем уменьшается)
            val = MainPayment + procentPart;
        }
        return Math.floor(val * 100) / 100;
    }



}
