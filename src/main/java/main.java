import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items are you purchasing?");
        String number = scanner.nextLine();
        int num_items = Integer.parseInt(number);
        int i;
        double subtotal = 0;
        for(i=1; i <= num_items; i++){
            System.out.println("Enter the price of item "+i);
            String price = scanner.nextLine();
            double x =Double.parseDouble(price);
            System.out.println("Enter the quantity of item "+i);
            String quantity = scanner.nextLine();
            double n = Double.parseDouble(quantity);
            subtotal += (x*n);
        }
        double taxes = subtotal*.055;
        double total = subtotal + taxes;
        System.out.println("Subtotal: "+(String.format("%.2f", subtotal))+"\nTaxes: "
                +(String.format("%.2f", taxes))+"\nTotal: "+(String.format("%.2f", total)));

    }
}
