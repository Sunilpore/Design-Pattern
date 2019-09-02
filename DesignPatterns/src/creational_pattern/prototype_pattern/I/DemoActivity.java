package creational_pattern.prototype_pattern.I;

public class DemoActivity {

    public static void main(String[] args) throws CloneNotSupportedException{

        BookShop bs = new BookShop();
        bs.setShopname("Novelity");
        bs.loadData();

        //Shallow clone
        //BookShop bs1 = (BookShop) bs.clone();

        //Deep clone
        BookShop bs1 = bs.deepClone();
        bs1.setShopname("A1");
        bs.getBooks().remove(2);

        /*Note:-
            Here remove 3rd element from 'bs1' also remove the element from 'bs'.
            Because 'bs1' is an clone obj of 'bs'  hence both will share same memory reference.
         */

        System.out.println(bs);
        System.out.println(bs1);

    }

}
