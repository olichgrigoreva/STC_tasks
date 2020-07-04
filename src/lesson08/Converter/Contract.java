package lesson08.Converter;

import java.util.Date;

public class Contract {
    private int id;
    private Date date;
    private String products[];

    public Contract(int id, Date date, String[] products) {
        this.id = id;
        this.date = date;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String[] getProducts() {
        return products;
    }

    public void testObj(){
        System.out.println("This is contract");
    }
}
