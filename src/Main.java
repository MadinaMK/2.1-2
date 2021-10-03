public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int replenishmentAmount = 1200;

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAccount = currentAccount + replenishmentAmount + bonus;
        System.out.println(totalAccount);

    }
}
