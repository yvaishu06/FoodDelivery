//restaurant class
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private String name;
    private Map<String, Double> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        menu.put(itemName, price);
    }

    public Map<String, Double> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', menu=" + menu + "}";
    }
}