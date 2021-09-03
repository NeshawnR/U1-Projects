import javax.swing.*;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args){

        double price;
        int quantity;
        double salesTax;
        double discount;

        price = Double.parseDouble(JOptionPane.showInputDialog("How much does it cost?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What's the discount?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
        salesTax = Integer.parseInt(JOptionPane.showInputDialog("What's the sales tax?"));

        final double totalTax = salesTax/100;
        double realDiscount = discount/100;
        double subTotal = price * quantity;
        double taxTotal =subTotal * totalTax;
        double totalCost = subTotal * taxTotal;
        double discountedPrice = price - (price * realDiscount);
        double purchasePrice = (discountedPrice * 1) + salesTax;


        JOptionPane.showMessageDialog(null, "Your subtotal is " + subTotal);
        JOptionPane.showMessageDialog(null, "Your tax total is " + taxTotal);
        JOptionPane.showMessageDialog(null, "Your total cost is " + totalCost);
        JOptionPane.showMessageDialog(null, "Your total cost with discount is " + purchasePrice);

    }
}
