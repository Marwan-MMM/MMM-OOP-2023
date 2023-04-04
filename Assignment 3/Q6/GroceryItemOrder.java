public class GroceryItemOrder {
    String Name;
    int quantity;
    double pricePerUnit;

    public GroceryItemOrder(String Name,int quantity,double pricePerUnit){
        this.Name=Name;
        this.quantity=quantity;
        this.pricePerUnit=pricePerUnit;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public double getCost(){
        return quantity*pricePerUnit;
    }
}
