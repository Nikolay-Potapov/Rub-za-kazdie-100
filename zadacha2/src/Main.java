public class Main {

    public static void main(String[] args) {
        int balanceOnThePhone = 100;
        int replenishmentAmount = 1200;
        boolean amountBonus = replenishmentAmount > 1000;
        int score;

        if (amountBonus) {
            score = replenishmentAmount / 100;
        } else {
            score = 0;
        }

        int total = score + balanceOnThePhone + replenishmentAmount;
        System.out.println(total);
    }
}


