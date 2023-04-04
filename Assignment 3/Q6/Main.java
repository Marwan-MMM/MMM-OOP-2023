public class Main {
    public static void main(String[] args) {
        GroceryList cart = new GroceryList();
        GroceryItemOrder One =  new GroceryItemOrder("Chicken", 3, 50);
        GroceryItemOrder Two = new GroceryItemOrder("Carrots", 2, 3);
        GroceryItemOrder Three = new GroceryItemOrder("Rice", 1, 21);

        try {
            cart.add(One);
            cart.add(Two);
            cart.add(Three);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Cost: " + cart.getTotalCost());
    }
}