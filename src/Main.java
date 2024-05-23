import java.util.Scanner;

public class Main {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;

    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice); // the dot after each word indicates a built-in Java function...
        // it's good practice to search through documentation for something you want to execute, like calculating...
        // the square root of a number, and see if there is already an existing function that can do that for you.
        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

    }

}