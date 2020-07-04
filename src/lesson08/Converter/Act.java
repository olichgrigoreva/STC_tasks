package lesson08.Converter;

import java.util.Date;

public class Act {
    private int id;
    private Date date;
    private String products[];

    public Act(int id, Date date, String[] products) {
        this.id = id;
        this.date = date;
        this.products = products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public void testObj(){
        System.out.println("This is act");
    }
}
