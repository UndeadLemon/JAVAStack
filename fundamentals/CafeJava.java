public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 3.7;
        double cappuccinoPrice = 4.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if(isReadyOrder1 == false) {
            System.out.println(customer1 + pendingMessage);
        };
        if(isReadyOrder1 == true) {
            System.out.println(customer1 + readyMessage);
        };
	// ** Your customer interaction print statements will go here ** //
    double orderPrice2 = (lattePrice + lattePrice);
                System.out.println(generalGreeting + customer2);
                System.out.println(displayTotalMessage + orderPrice2);
        if(isReadyOrder1 == false) {
            System.out.println(customer2 + pendingMessage);
        };
        if(isReadyOrder1 == true) {
            System.out.println(customer2 + readyMessage);
        };
    double orderPrice3 = (lattePrice - dripCoffeePrice);
                System.out.println(generalGreeting + customer3); 
        System.out.println(displayTotalMessage + orderPrice3);
        if(isReadyOrder1 == false) {
            System.out.println(customer3 + pendingMessage);
        };
        if(isReadyOrder1 == true) {
            System.out.println(customer3 + readyMessage);
        };
    double orderPrice4 = cappuccinoPrice;
                System.out.println(generalGreeting + customer4);
        System.out.println(displayTotalMessage + orderPrice4);
        if(isReadyOrder1 == false) {
            System.out.println(customer4 + pendingMessage);
        };
        if(isReadyOrder1 == true) {
            System.out.println(customer4 + readyMessage);
        };
    
    }
}
