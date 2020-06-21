package lesson07;

class MoneyOperation {
    String compareMoney (int prodPrice, int getPrice){
        String result;
        if (prodPrice == getPrice){
            result = "Спасибо за заказ!";
        }
        if (prodPrice > getPrice){
            result = "Автомат сдачи не выдает!";
        } else {
            result = "Недостаточно средств!";
        }
        return result;
    }
}
