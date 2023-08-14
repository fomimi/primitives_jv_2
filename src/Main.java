public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int accountRefill = 2000;
        currentAccount += accountRefill;

        int bonusRubles = accountRefill > 1000 ? accountRefill / 100 : 0;

        System.out.println("Бонусные рубли: " + bonusRubles + "\nИтоговый счёт: " + currentAccount);
    }
}