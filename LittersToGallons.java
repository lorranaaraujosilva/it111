public class LittersToGallons {


    public static void main(String[] args) {

        // liters to gallon

        double liters;
        double gallons;
        int counter = 0;


        for (gallons = 1; gallons <= 100; gallons = gallons+4) {
            liters = gallons / 0.264172;


            // Use "gallon" for the first line only
            if (gallons == 1) {
                System.out.printf("%.2f liters = %.0f gallon%n", liters, gallons);
            } else {
                System.out.printf("%.2f liters = %.0f gallons%n", liters, gallons);
            }


            counter++;

            if (counter % 5 == 0) {
                System.out.println(); // Add a blank line every 5 entries
        }
} //end for loop
        System.out.println("all done");

}
}
