
package package1;

import java.util.ArrayList;

public class Order {
private	String name;
private	double total;
private	boolean ready ;
private ArrayList<Item> items;

public Order() {
    this.name  = "Guest";
    this.items = new ArrayList<Item>();
    this.total = 0.0;
    this.ready = false;
}
public Order(String name) {
    this.name  = name;
    this.items = new ArrayList<Item>();
    this.total = 0.0;
    this.ready = false;
}



public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getTotal() {
	return total;
}


public void setTotal(double total) {
	this.total = total;
}


public boolean isReady() {
	return ready;
}


public void setReady(boolean ready) {
	this.ready = ready;
}


public ArrayList<Item> getItems() {
	return items;
}


public void setItems(ArrayList<Item> items) {
	this.items = items;
}

public void addItem(Item item) {
    items.add(item);
}
public String getStatusMessage() {
    if (ready) {
        return "Your order is ready.";
    } else {
        return "Thank you for waiting. Your order will be ready soon.";
    }
}
public double getOrderTotal() {
    double total = 0.0;
    for (Item item : items) {
        total += item.getPrice();
    }
    return total;
}
public void display() {
    System.out.println("Customer Name: " + name);
    for (Item item : items) {
        System.out.println(item.getName() + " - $" + item.getPrice());
    }
    System.out.println("Total: $" + getOrderTotal());
}



}
