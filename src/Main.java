import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double income;
        double taxRate;
        double weeklyIncome;

        System.out.println("Enter the weekly income: ");
        income = input.nextDouble();

        if (income >= 2500) {
            taxRate = 0.3;
        } else if (income >= 1500) {
            taxRate = 0.2;
        } else if (income >= 500) {
            taxRate = 0.15;
        } else taxRate = 0.1;

        weeklyIncome = (1 - taxRate) * income;

        taxRate = taxRate * 100;

        System.out.println("Tax rate is: " + taxRate + "%");
        System.out.println("Weekly net income is: " + weeklyIncome);

    }
}