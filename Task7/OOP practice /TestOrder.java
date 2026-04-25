
package package1;

public class TestOrders {

	public static void main(String[] args) {
		 // Create Menu Items 
        Item mocha      = new Item("mocha",       5.50);
        Item latte      = new Item("latte",       4.75);
        Item dripCoffee = new Item("drip coffee", 2.50);
        Item cappuccino = new Item("cappuccino",  5.00);
        Item espresso   = new Item("espresso",    3.00);
 
        //  Guest Orders (no name) 
        Order guest1 = new Order();
        guest1.addItem(mocha);
        guest1.addItem(dripCoffee);
 
        Order guest2 = new Order();
        guest2.addItem(latte);
        guest2.addItem(espresso);
 
        // Create  Orders
        Order order1 = new Order("Cindhuri");
        order1.addItem(dripCoffee);
        order1.addItem(cappuccino);
 
        Order order2 = new Order("Jimmy");
        order2.addItem(mocha);
        order2.addItem(latte);
 
        Order order3 = new Order("Noah");
        order3.addItem(cappuccino);
        order3.addItem(espresso);
 
        //  Test getStatusMessage
        System.out.println("=== Status Messages ===");
 
        order1.setReady(true);
        order2.setReady(true);
 
        System.out.println("Cindhuri: " + order1.getStatusMessage());
        System.out.println("Jimmy: " + order2.getStatusMessage());
        System.out.println("Noah: " + order3.getStatusMessage());
        System.out.println("Guest 1:" + guest1.getStatusMessage());
        System.out.println("Guest 2:" + guest2.getStatusMessage());
 
        // Test getOrderTotal 
        System.out.println("\n Order Totals :");
        System.out.println("Cindhuri total: " + order1.getOrderTotal());
        System.out.println("Jimmy total:    " + order2.getOrderTotal());
        System.out.println("Noah total:     " + order3.getOrderTotal());
        System.out.println("Guest 1 total:  " + guest1.getOrderTotal());
        System.out.println("Guest 2 total:  " + guest2.getOrderTotal());
 
        // Test display 
        System.out.println("\n Full Display:");
        System.out.println("---------------------------");
        guest1.display();
        System.out.println("---------------------------");
        guest2.display();
        System.out.println("---------------------------");
        order1.display();
        System.out.println("---------------------------");
        order2.display();
        System.out.println("---------------------------");
        order3.display();
        System.out.println("---------------------------");
	
	
	}
	

}
