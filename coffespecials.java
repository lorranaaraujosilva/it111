import java.util.Scanner;

public class coffespecials {
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding weekends. Monday - Friday only");
        specials = input.next();

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a day of the week excluding weekends");
            specials = input.next();


        }

        //in the world of coffee i need a name of a coffee beverage and a price

        String coffee = "";
        double price = 0.0;

        switch (specials) {

            // my cases will be day of the week

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frapuccino";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Capuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Matcha";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }
        }

        System.out.println("How many " +coffee+ "s would you like to order?");
        int quantity = input.nextInt();

        if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else if (quantity == 0) {
                System.out.println("Looks like you dont like " + coffee + "! So sad!");
            } else {
                System.out.println("Looks like you will be ordering " + quantity + " " + coffee + "s today!");


                double total = price * quantity;
                System.out.printf("Your total for %d %s(s) will be: $%.2f%n", quantity, coffee, total);

            }


        }
    }
