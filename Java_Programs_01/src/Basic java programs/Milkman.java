import java.util.Scanner;

public class Milkman 
{   
    public static void main(String[] args) 
    {
            double purchesed_milk;
            double water_added,water_milk;
            double milk_buy=3.25,sell_w_milk=4.15,gain_vendor,buy,sell;

            System.out.println("Enter the number of liters of milk purchased by the vendor:");
            Scanner obj1=new Scanner(System.in);
            purchesed_milk=obj1.nextInt();

            water_added = purchesed_milk / 4;
            System.out.println("The amount of water added to the milk in liters is:\n"+water_added);

            water_milk = purchesed_milk + water_added;
            System.out.println("The final quantity of milk and water mixture is:\n"+water_milk);

            buy = purchesed_milk * milk_buy;
            sell = water_milk * sell_w_milk;

            gain_vendor = sell - buy;

            System.out.println("The gain of the vendor is = "+gain_vendor+"rupees");
    }
}
