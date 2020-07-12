package lesson08.Converter;

import java.util.Date;

public class Converter {
    public static Act convert(Contract contract, Act act){
        int id;
        Date date;
        String products[];

        id = contract.getId();
        date = contract.getDate();
        products = contract.getProducts();

        Act newAct = new Act(id, date, products);
        return newAct;
    }
}
