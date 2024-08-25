// order class
import java.util.HashMap;
import java.util.Map;

public class Order {
    private User user;
    private Restaurant restaurant;
    private Map<String, Integer> items; // item name and quantity

    public Order(User user, Restaurant restaurant) {
        this.user = user;
        this.restaurant = restaurant;
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            Double price = restaurant.getMenu().get(itemName);
            if (price != null) {
                total += price * quantity;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{user=" + user + ", restaurant=" + restaurant + ", items=" + items + ", total=" + calculateTotal() + "}";
    }
}