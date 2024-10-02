class Order {
    private boolean isPickUp = false;
    private boolean isPrepare = false;

    public void placeOrder() throws InterruptedException { // coustomer
        while (isPickUp) {
            wait(); // wait for order
        }
        System.out.println("Customer places the order");
        isPickUp = true;
        notifyAll();
    }

    public void pickOrder() throws InterruptedException { // waiter
        while (!isPickUp || isPrepare) {
            wait(); // wait if order is not place
        }
        System.out.println("Waiter picks the order and notify to chef");
        isPickUp = false;
        notifyAll();
    }

    public void preparedOrder() throws InterruptedException { // chef
        while (isPrepare || !isPickUp) {
            wait(); // wait for order is not picked up or already prepared
        }
        System.out.println("Chef is preparing the order");
        Thread.sleep(1000);
        System.out.println("Chef has prepared the order");
        isPickUp = true;
        notifyAll();
    }
}

class Customer implements Runnable {
    private Order order;

    public Customer(Order order) {
        this.order = order;
    }

    public void run() {
        try {
            order.placeOrder(); // Customer places the order
        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }
}

class Waiter implements Runnable {
    private Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    public void run() {
        try {
            order.pickOrder(); // Waiter pick the order from coustomer
        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }

}

class Chef implements Runnable {
    private Order order;

    public Chef(Order order) {
        this.order = order;
    }

    public void run() {
        try {
            order.preparedOrder(); // Chef is preparing the order
        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }

}

public class Restuarant {

    public static void main(String[] args) {
        Order ord = new Order();
        Thread customer = new Thread(new Customer(ord));
        Thread waiter = new Thread(new Waiter(ord));
        Thread chef = new Thread(new Chef(ord));
        customer.start();
        waiter.start();
        chef.start();

    }
}
