package Classes;

public class Book {
    private String name;
    private Integer id;
    private Boolean isBorrowed;

    public Book(){

    }

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
        isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isEmprestado() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return "Book | " + name + " | " + id + " | " + isBorrowed;
    }
}
