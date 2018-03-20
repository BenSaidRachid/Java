import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        Hamburger hamburger;
        Deluxe_Burger deluxe_burger;
        Healthy_Burger healthy_burger;
        double price = 0;
        while(check) {
            hamburger = new Hamburger(new Bread(), new Meat(), "Hamburger");
            healthy_burger = new Healthy_Burger(new Bread(), new Meat());
            deluxe_burger = new Deluxe_Burger(new Bread(), new Meat());
            System.out.println("Choose your Hamburger: ");
            System.out.println("1- " + hamburger.getName());
            System.out.println("2- " + deluxe_burger.getName());
            System.out.println("3- " + healthy_burger.getName() + "\n");
            System.out.println("Show composition: 4\n\n");
            System.out.println("Price: " + price);

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("You chosen Hamburger\n\n");
                    price += hamburger.getPrice();
                    System.out.println("Price: " + price + "\n\n");
                    System.out.println("Do you want to continue ?");
                    System.out.println("1- Yes");
                    System.out.println("2- no");
                    if(sc.nextInt() == 2) {
                        check = false;
                    }

                    break;
                case 2:
                    System.out.println("You chosen Burger deluxe\n\n");
                    price += deluxe_burger.getPrice();
                    System.out.println("Price: " + price + "\n\n");
                    System.out.println("Do you want to continue ?");
                    System.out.println("1- Yes");
                    System.out.println("2- no");

                    if(sc.nextInt() == 2) {
                        check = false;
                    }

                    break;
                case 3:
                    System.out.println("You chosen Burger healthy\n\n");
                    price += healthy_burger.getPrice();
                    System.out.println("Price: " + price + "\n\n");
                    System.out.println("Do you want to continue ?");
                    System.out.println("1- Yes");
                    System.out.println("2- no");

                    if(sc.nextInt() == 2) {
                        check = false;
                    }

                    break;
                case 4:
                    System.out.println("Which composition do you want to display?");
                    System.out.println("1- " + hamburger.getName());
                    System.out.println("2- " + deluxe_burger.getName());
                    System.out.println("3- " + healthy_burger.getName());
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println(hamburger.getComposition());
                            break;
                        case 2:
                            System.out.println(deluxe_burger.getComposition());
                            break;
                        case 3:
                            System.out.println(healthy_burger.getComposition());
                            break;
                        default:
                            System.out.println("Unknown command");
                            break;
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
