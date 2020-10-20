package builder.with_builder;

import java.util.List;

public class PizzaDish implements Pizza {

    private String bread;
    private List <String> ingred;
    private String cheese;
    private int bakingDuration;
    private int bakingTemprature;


    @Override
    public void setBread(String bread)
    {
        this.bread = bread;
    }

    @Override
    public void setIngredients(List<String> ingred)
    {
        this.ingred = ingred;
    }

    @Override
    public void setCheese(String cheese)
    {
        this.cheese = cheese;

    }

    @Override
    public void setBakingDuration(int duration)
    {
        this.bakingDuration = duration;
    }

    @Override
    public void setBakingTemprature(int temprature)
    {
        this.bakingTemprature = temprature;

    }

    public String toString ()
    {
        String pizza = "The dish is made of " + this.bread + "," +
                this.ingred.toString().replace('[', ' ').replace(']', ',') +
                " " + this.cheese + ". Please enjoy!";
        return pizza;
    }

}
