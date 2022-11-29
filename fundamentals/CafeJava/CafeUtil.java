import java.util.ArrayList;

public class CafeUtil{
    public static int getStreakGoal(){
        int total = 0;
        for(int i = 0; i<=10; i++){
            total += i;
        }
        return total;
    };
    public static int getStreakGoal(int numWeeks){
        int total = 0;
        for(int i = 0; i <= numWeeks; i++){
            total += i;
        }
        return total;
    }
    public static double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for(int i = 0; i < prices.length; i++){

            totalPrice += prices[i];
            
        }
        return totalPrice;
    }
    public static void displayMenu(ArrayList<String> menuItems){
        for(int i = 1; i<=menuItems.size(); i++){
            System.out.println((i-1) + " " + menuItems.get(i-1));
        }
    }
    public static void addCustomer(ArrayList<String> customers){
        
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            System.out.println("Hello, " + userName);
            System.out.println("There are " + customers.size() + " people ahead of you.");
            customers.add(userName);
            System.out.println(customers.toString());
        
    }

};