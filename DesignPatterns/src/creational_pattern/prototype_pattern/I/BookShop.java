package creational_pattern.prototype_pattern.I;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopname;
    List<Book> books = new ArrayList<>();


    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){

        for (int i=1;i<10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book "+i);
            getBooks().add(b);
        }
    }


    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }


    //Here we not exposed the object to return and make it generic,
    //while typecast it with in method call
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //Here we exposed object type in return, So need to write typecasting while calling the method
    //But it is not generic
    protected BookShop deepClone() throws CloneNotSupportedException {
        BookShop shop  = new BookShop();
        shop.getBooks().addAll(this.getBooks());
        return shop;
    }

}
