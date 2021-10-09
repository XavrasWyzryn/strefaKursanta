public class Money {
    private int zloty; // prywatne pole typu int o nazwie zloty
    private int grosz; // prywatne pole typu int o nazwie grosz

    // metoda, ktora dodaje nam pieniadze do aktualnej kwoty
    void addMoney(Money money) {
        this.zloty += money.getZloty();
        this.grosz += money.getGrosz();
        this.zloty += this.grosz/100;
        this.grosz = this.grosz % 100;
    }

    // metoda, ktora nam odejmuje pieniadze od aktualnej kwoty
    void minusMoney(Money money) {
        if(this.isSmallerThan(money)) {
            System.out.println("We can't take that much money!");
            return;
        }
        zloty -= money.getZloty();
        if (grosz < money.getGrosz()) {
            zloty--;
            grosz = 100 + grosz - money.getGrosz();
        } else {
            grosz -= money.getGrosz();
        }
    }

    // metoda, ktora nam porownuje dwie kwoty i mowi, czy dokladnie ten obiekt jest wiekszy lub rowny od kwoty z parametru money
    boolean isGreaterThanOrEquals(Money money) {
        if (this.zloty > money.getZloty()) {
            return true;
        }
        if (this.zloty == money.getZloty() && this.grosz >= money.getGrosz()) {
            return true;
        }
        return false;
    }

    // metoda, ktora nam porownuje dwie kwoty i mowi, czy dokladnie ten obiekt jest mniejszy od kwoty z parametru money
    boolean isSmallerThan(Money money) {
        if (this.zloty < money.getZloty()) {
            return true;
        }
        if (this.zloty == money.getZloty() && this.grosz < money.getGrosz()) {
            return true;
        }
        return false;
    }

    // pobieramy wartosc z pola zloty
    public int getZloty() {
        return this.zloty;
    }

    // ustawiamy nowa wartosc na polu zloty
    public void setZloty(int zloty) {
        this.zloty = zloty;
    }

    // pobieramy wartosc z pola grosz
    public int getGrosz() {
        return this.grosz;
    }

    // ustawiamy wartosc na polu grosz
    public void setGrosz(int grosz) {
        if (grosz >= 100) {
            System.out.println("Max grosz value is 99!");
            return;
        }
        this.grosz = grosz;
    }
}
