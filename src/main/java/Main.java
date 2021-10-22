public class Main {
    public static void main(String[] args) {
        BonusService run = new BonusService();
        long amount=1000_000_60;
        boolean registed=false;
        long expected=30;
        long actual = run.calculate(amount,registed);

        System.out.println(actual);
    }
}
