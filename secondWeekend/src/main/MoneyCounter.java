public class MoneyCounter {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.countMoneyInWallet();

        Money money = new Money();
        money.setGrosz(50);
        money.setZloty(5);

        wallet.addMoneyToWallet(money);
        wallet.addMoneyToWallet(money);
        wallet.countMoneyInWallet();

        wallet.takeMoneyFromWallet(money);
        wallet.countMoneyInWallet();

        money.setZloty(4);
        if(wallet.canAffordShopping(money)) {
            wallet.takeMoneyFromWallet(money);
        }
        wallet.countMoneyInWallet();

        wallet.takeMoneyFromWallet(money);
        wallet.countMoneyInWallet();
    }
}
