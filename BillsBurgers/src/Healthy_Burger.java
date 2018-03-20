public class Healthy_Burger extends Hamburger {
    private Onion onion = new Onion();
    private Mushroom mushroom = new Mushroom();
    private double price;

    public Healthy_Burger(Bread bread, Meat meat) {
        super(bread, meat, "Healthy burger");
        price = super.getPrice() + this.mushroom.getPrice() +  this.onion.getPrice();
        super.setPrice(price);
        super.getComposition().add(this.mushroom.getName());
        super.getComposition().add(this.onion.getName());
    }
}
