package ru.netology.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrderService {
    HashMap<Integer, Order> orders = new HashMap<>();

    public OrderService() {
        orders.put(1, new Order(1, 150, 840, Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor")));
        orders.put(2, new Order(1, 85, 840, Arrays.asList("Phone Case", "Charger", "Headphones")));
        orders.put(3, new Order(2, 200, 840, Arrays.asList("TV", "Soundbar", "HDMI Cable", "Wall Mount")));
        orders.put(4, new Order(2, 45, 840, Arrays.asList("Book", "Notebook", "Pen", "Bookmark")));
        orders.put(5, new Order(3, 120, 840, Arrays.asList("Shoes", "Socks", "Sneaker Cleaner", "Shoe Laces")));
        orders.put(6, new Order(3, 180, 840, Arrays.asList("Jacket", "Sweater", "T-shirt", "Jeans")));
        orders.put(7, new Order(4, 95, 840, Arrays.asList("Coffee Maker", "Coffee Beans", "Mug", "Sugar", "Cream")));
        orders.put(8, new Order(5, 220, 840, Arrays.asList("Tablet", "Stylus", "Case", "Screen Protector")));
        orders.put(9, new Order(5, 60, 840, Arrays.asList("Backpack", "Water Bottle", "Lunchbox")));
        orders.put(10, new Order(6, 130, 840, Arrays.asList("Watch", "Watch Band", "Cleaning Cloth", "Battery")));
        orders.put(11, new Order(7, 75, 840, Arrays.asList("Skincare Set", "Face Cream", "Toner", "Cleanser")));
        orders.put(12, new Order(7, 160, 840, Arrays.asList("Gaming Console", "Controller", "Game")));
        orders.put(13, new Order(8, 40, 840, Arrays.asList("Puzzle", "Board Game", "Cards", "Dice")));
        orders.put(14, new Order(9, 110, 840, Arrays.asList("Blender", "Cutting Board", "Knife Set")));
        orders.put(15, new Order(9, 190, 840, Arrays.asList("Camera", "Memory Card", "Case", "Tripod")));
        orders.put(16, new Order(10, 55, 840, Arrays.asList("Yoga Mat", "Water Bottle", "Towel")));
        orders.put(17, new Order(10, 140, 840, Arrays.asList("Tool Set", "Drill", "Screwdriver", "Pliers")));
        orders.put(18, new Order(11, 85, 840, Arrays.asList("Perfume", "Body Lotion", "Shower Gel", "Deodorant")));
        orders.put(19, new Order(12, 170, 840, Arrays.asList("Smartphone", "Case", "Protector", "Charger")));
        orders.put(20, new Order(12, 65, 840, Arrays.asList("Desk Lamp", "Bulbs", "Extension Cord")));
        orders.put(21, new Order(13, 125, 840, Arrays.asList("Vacuum Cleaner", "Filters", "Bags", "Cleaning Brushes")));
        orders.put(22, new Order(14, 95, 840, Arrays.asList("Fitness Tracker", "Charger", "Strap")));
        orders.put(23, new Order(14, 150, 840, Arrays.asList("Air Fryer", "Cooking Oil", "Recipe Book")));
        orders.put(24, new Order(15, 80, 840, Arrays.asList("Plant", "Pot", "Soil", "Fertilizer")));
        orders.put(25, new Order(15, 135, 840, Arrays.asList("Speaker", "Audio Cable", "Wall Mount", "Remote Control")));
    }

    public List<Order> getOrders(int userId) {
        List<Order> returnOrders = new ArrayList<>();
        orders.forEach((k, v) ->
        {
            if (userId == v.getUserId()) {
                returnOrders.add(v);
            }
        });
        return returnOrders;
    }
}
