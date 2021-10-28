public class Main {
    public static void main(String[] args) {
        // начальный баланс
        int balanceOnThePhone = 500;
        // сумма пополнения
        int replenishmentAmount = 1100;
        // колличество бонусных рублей
        int bonusScore = replenishmentAmount / 100;
        // итоговая сумма с бонусами
        int totalBonus = balanceOnThePhone + replenishmentAmount + bonusScore;
        // итогова сумма без бонусов
        int total = balanceOnThePhone + replenishmentAmount;

        if (replenishmentAmount > 1000 || replenishmentAmount == 1000) {
            System.out.println("Итоговый баланс с бонусом = " + totalBonus);
        } else {
            System.out.println("Итоговый баланс = " + total);
        }
    }
}


