import java.util.ArrayList;

public class Hamburger {
    private Bread bread;
    private Meat meat;
    private Lettuce lettuce = new Lettuce();
    private Tomato tomato = new Tomato();
    private Cheese cheese = new Cheese();
    private Dill_Pickles dill_pickles = new Dill_Pickles();
    private String name;
    private double price;
    private ArrayList composition = new ArrayList();
    public Hamburger(Bread bread, Meat meat, String name) {
        this.bread = bread;
        this.meat = meat;
        this.name = name;
        this.price = this.bread.getPrice() + this.meat.getPrice() + this.lettuce.getPrice()
        + this.tomato.getPrice() + this.cheese.getPrice() + this.dill_pickles.getPrice();

        this.composition.add(this.bread.getName());
        this.composition.add(this.meat.getName());
        this.composition.add(this.lettuce.getName());
        this.composition.add(this.tomato.getName());
        this.composition.add(this.cheese.getName());
        this.composition.add(this.dill_pickles.getName());

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Dill_Pickles getDill_pickles() {
        return dill_pickles;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public ArrayList getComposition()
    {
        return composition;
    }


}
