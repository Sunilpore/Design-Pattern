package structural_pattern.composite_pattern;

public class CompositeActivity {

    /*
        Composite design pattern is use to create structure of an object
     */

    public static void main(String[] args) {

        Component hd = new Leaf(4000,"Hard Disk");
        Component mouse = new Leaf(200,"Mouse");
        Component monitor = new Leaf(3000,"Monitor");
        Component ram = new Leaf(2000,"RAM");
        Component cpu = new Leaf(5000,"CPU");

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ph.showPrice();
        //cabinet.showPrice();
        //computer.showPrice();

    }

}
