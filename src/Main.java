import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of the item: ");
        if (in.hasNextDouble()){
            double price = in.nextDouble();
            if (price >= 100){
                System.out.println("Items over $100 have no shipping costs. Your total is $" + df.format(price));
            }
            else {
                double total = price * 1.02;
                System.out.println("Your item costs $" + df.format(price) + " so your total, with 2% shipping, is $" + df.format(total));
            }
        }
        else {
            System.out.println("That's not quite right. Run the program again and try one more time.");
        }
    }
}