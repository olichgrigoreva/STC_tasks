package lesson07;

public enum Cookies {
    OREO(30), KITKAT(40), TUC(25), CHOCOPIE(35), MARS(50), TWIX(40);

    private int price;

    Cookies(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
