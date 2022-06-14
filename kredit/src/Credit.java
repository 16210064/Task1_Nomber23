public class Credit {
    protected double money, months, percent;
    protected CreditType creditType;

    public Credit(double money, double months, double percent, CreditType creditType) {
        this.money = money;
        this.months = months;
        this.percent = percent;
        this.creditType = creditType;
    }

    public double Calculate(){
        double fullMoney = 0;
        for (int i = 1; i < months + 1; i++){
            fullMoney += Calculate(i);
        }
        return fullMoney;
    }
    public double Calculate(int month){
        return 0;
    }

    public CreditType getCreditType() {
        return creditType;
    }

    public void setCreditType(CreditType creditType) {
        this.creditType = creditType;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getMonths() {
        return months;
    }

    public void setMonths(double months) {
        this.months = months;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
