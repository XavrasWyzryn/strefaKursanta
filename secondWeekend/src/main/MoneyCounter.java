public class MoneyCounter {
    public static void main(String[] args) {
        // deklarujemy zmienna typu Wallet i towrzymy jej obiekt
        Wallet walletObject = new Wallet();
        // wywolujemy metode cpuntMoneyInWallet na obiekcie walletObject
        walletObject.countMoneyInWallet();

        // deklarujemy zmienna typu Money i tworzymy jej obiekt
        Money price = new Money();
        // uzywamy metody setGrosz na obiekcie price, aby ustawic ilosc groszy w tym obiekcie
        price.setGrosz(50);
        // uzywamy metody setZloty na obiekcie price, aby ustawic ilosc zloty w tym obiekcie
        price.setZloty(5);

        // uzywamy metody addMoneyToWallet z parametrem price na obiekcie walletObject
        walletObject.addMoneyToWallet(price);
        walletObject.addMoneyToWallet(price);
        // uzywamy metody countMoneyInWallet na obiekcie walletObject (bez parametrow)
        walletObject.countMoneyInWallet();

        // uzywamy metody takeMoneyFromWallet z parametrem price na obiekcie walletObject
        walletObject.takeMoneyFromWallet(price);
        // uzywamy metody countMoneyInWallet na obiekcie walletObject (bez parametrow)
        walletObject.countMoneyInWallet();

        // uzywamy metody setZloty z parametrem 4 na obiekcie price (ustawiamy nowa wartosc zloty)
        price.setZloty(4);
        // sprawdzamy czy nas stac na zakupy za pieniadze rowne obiektowi price
        if(walletObject.canAffordShopping(price)) {
            // jesli tak, to dokonujemy zakupu
            walletObject.takeMoneyFromWallet(price);
        }
        // liczymy, ile zostalo nam pieniedzy
        walletObject.countMoneyInWallet();

        // probujemy zabrac pieniadze z portfela bez liczenia, czy ich tyle mamy
        walletObject.takeMoneyFromWallet(price);
        // liczymy ile zostalo
        walletObject.countMoneyInWallet();
    }
}
