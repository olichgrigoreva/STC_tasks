package lesson06.model;

import javax.crypto.spec.PSource;
import java.util.Date;

public class Reader extends Person{
    private Date registrationDate = new Date();
    private int readId;

    //конструктор Person
    public Reader(String firstName, String lastName, int readerId) {
        super(firstName, lastName);
        this.readId = readerId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public int getReadId() {
        return readId;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setReadId(int readId) {
        this.readId = readId;
    }
}
