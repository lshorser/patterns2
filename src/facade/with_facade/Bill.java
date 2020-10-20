package facade.with_facade;

import java.util.*;


public class Bill {


    private int id ;
    private List<OrderItem> orderItems;
    private double totalPrice;


    public Bill (int id)
    {
        this.id = id;
        this.orderItems = new ArrayList <> ();
        this.totalPrice = 0;
    }


    public int getID ()
    {
        return this.id;
    }


    public List <OrderItem> getOrderItems ()
    {
        return this.orderItems;
    }

    public void add (FoodItem it, int quant)
    {
        orderItems.add (new OrderItem(it, quant));
    }


    public void setTotal (double total)
    {
        this.totalPrice = total;
    }


    public double getTotal ()
    {
        return this.totalPrice;
    }



}
