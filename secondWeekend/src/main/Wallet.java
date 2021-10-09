public class Wallet {
    Money moneyInWallet = new Money();

    void addMoneyToWallet(Money money) {
        moneyInWallet.addMoney(money);
    }

    void takeMoneyFromWallet(Money money) {
        if (moneyInWallet.isSmallerThan(money)) {
            System.out.println("There is not enough money in wallet.");
            return;
        }
        moneyInWallet.minusMoney(money);
    }

    Money countMoneyInWallet() {
        System.out.println(String.format("In wallet we have %d zlotych and %d groszy.", moneyInWallet.getZloty(), moneyInWallet.getGrosz()));
        return moneyInWallet;
    }

    boolean canAffordShopping(Money price) {
        if (moneyInWallet.isGreaterThanOrEquals(price)) {
            System.out.println("Yes, you can afford that.");
            return true;
        } else {
            System.out.println("No, you can't afford that.");
            return false;
        }
    }
}
