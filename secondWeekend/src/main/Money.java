public class Money {
    private int zloty;
    private int grosz;

    void addMoney(Money money) {
        this.zloty += money.getZloty();
        this.grosz += money.getGrosz();
        this.zloty += this.grosz/100;
        this.grosz = this.grosz % 100;
    }

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

    boolean isGreaterThanOrEquals(Money money) {
        if (this.zloty > money.getZloty()) {
            return true;
        }
        if (this.zloty == money.getZloty() && this.grosz >= money.getGrosz()) {
            return true;
        }
        return false;
    }

    boolean isSmallerThan(Money money) {
        if (this.zloty < money.getZloty()) {
            return true;
        }
        if (this.zloty == money.getZloty() && this.grosz < money.getGrosz()) {
            return true;
        }
        return false;
    }

    public int getZloty() {
        return this.zloty;
    }

    public void setZloty(int zloty) {
        this.zloty = zloty;
    }

    public int getGrosz() {
        return this.grosz;
    }

    public void setGrosz(int grosz) {
        if (grosz >= 100) {
            System.out.println("Max grosz value is 99!");
            return;
        }
        this.grosz = grosz;
    }
}
