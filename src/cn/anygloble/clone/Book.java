package cn.anygloble.clone;

public class Book implements Cloneable{
    private String bookname;

    public Book(String bookname) {
        this.bookname = bookname;
    }

    public Book() {
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                '}';
    }
}
