/**
 *
 * @author Darkw
 */

public class Supply {
    
    //instance variables
    private String name;
    private double price;
    
    //constructor
    public Supply(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    //get functions
    
    //returns String name
    public String getName(){
        return name;
    }
    
    //returns double price
    public double getPrice(){
        return price;
    }
    
    //set functions
    
    //input String name
    //sets name to given String
    public void setName(String name){
        this.name = name;
    }
    
    //input double price
    //sets price to given double
    public void setPrice(double price){
        this.price = price;
    }
}
