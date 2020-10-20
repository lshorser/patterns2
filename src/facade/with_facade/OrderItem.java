package facade.with_facade;

public class OrderItem {

    private FoodItem Item;
    private int quantity;

    public OrderItem (FoodItem item, int quant)
    {
        this.Item = item;
        this.quantity = quant;
    }

    public FoodItem getItem ()
    {
        return this.Item;
    }

    public int getQuantity ()
    {
        return this.quantity;
    }


    public String toString ()
    {
        return Item.toString() + "," + quantity;
    }

}
