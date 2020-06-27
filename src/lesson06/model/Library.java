package lesson06.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Employee> employees = new ArrayList<Employee>(); //список сотрудников
    private List<Reader> readers = new ArrayList<Reader>(); //список читателей
    private List<Book> books = new ArrayList<Book>(); //список книг

    //добавление в список сотрудника, запись ссылки внешнего объекта
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    //добавление в список читателя, запись ссылки внешнего объекта
    public void addReader(Reader reader){
        this.readers.add(reader);
    }

    //добавление в список книги, запись ссылки внешнего объекта
    public void addBook(Book book){
        this.books.add(book);
    }
}
