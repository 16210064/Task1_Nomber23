public class Main {
    public static void main(String[] args) {
        Credit credit = new DiffCredit(5000, 6, 50), credit1 = new AnnCredit(15000, 6, 48);
        System.out.println("общая сумма кредита - 1: " + credit.Calculate() + " 2: " + credit1.Calculate());
        for (int i = 1; i < credit.getMonths() + 1; i++){
            System.out.println("платеж за " + i + " месяц - 1: " + credit.Calculate(i) + " 2: " + credit1.Calculate(i));
        }
    }
}