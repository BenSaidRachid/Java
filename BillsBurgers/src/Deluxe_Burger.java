public class Deluxe_Burger extends Hamburger {
    private Drink drink = new Drink();
    private Chips chips = new Chips();
    private double price;
    public Deluxe_Burger(Bread bread, Meat meat) {
        super(bread, meat, "Deluxe burger");
        price = super.getPrice() + this.drink.getPrice() +  this.chips.getPrice();
        super.setPrice(price);
        super.getComposition().add(this.drink.getName());
        super.getComposition().add(this.chips.getName());
    }
}
