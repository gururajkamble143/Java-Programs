import java.util.Scanner;

public class Discount_10 
{
    public static void main(String[] args) 
    {
        int quantity, total_cost, cost;
        System.out.println("Enter the Quantity = ");
        Scanner Qu=new Scanner(System.in);
        quantity=Qu.nextInt();

        cost = quantity * 100;

        if(cost>=1000)
        {
            total_cost = cost - (10 * cost) / 100;
            System.out.println("total cost = "+total_cost);
        }
        else
        {
            total_cost = cost;
            System.out.println("total cost = "+total_cost);
        }
    }
}
