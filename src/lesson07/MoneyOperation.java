package lesson07;

class MoneyOperation {
    String compareMoney(int prodPrice, int getPrice) {
        String result;
        if (prodPrice == getPrice) {
            result = "Спасибо за заказ!";
        }
        if (prodPrice > getPrice) {
            result = "Автомат сдачи не выдает!";
        } else {
            result = "Недостаточно средств!";
        }
        return result;
    }

    public static void payment(Cookies selectedItem, int getProdPrice) {
        if (selectedItem.getPrice() == getProdPrice) {
            System.out.println("Спасибо за покупку!");
        } else if (selectedItem.getPrice() > getProdPrice) {
            System.out.println("Недостаточно средств!");
        } else {
            System.out.println("Автомат сдачи не выдает! Спасибо за покупку!");
        }
    }
}
