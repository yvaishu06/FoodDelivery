//main class
public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice", "123 Main St");
        User user2 = new User("Bob", "456 Elm St");

        // Create restaurants and add menu items
        Restaurant restaurant1 = new Restaurant("Pizza Place");
        restaurant1.addItem("Margherita Pizza", 10.99);
        restaurant1.addItem("Pepperoni Pizza", 12.99);

        Restaurant restaurant2 = new Restaurant("Burger Joint");
        restaurant2.addItem("Cheeseburger", 8.99);
        restaurant2.addItem("Veggie Burger", 7.99);

        // Create orders
        Order order1 = new Order(user1, restaurant1);
        order1.addItem("Margherita Pizza", 2);

        Order order2 = new Order(user2, restaurant2);
        order2.addItem("Cheeseburger", 1);

        // Print orders
        System.out.println(order1);
        System.out.println(order2);
    }
}