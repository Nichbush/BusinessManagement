/**
 *
 * @author Darkw
 */

import java.util.List;

public class Product {
    
    //instance variables
    private String name;
    private double price;
    private List<Supply> suppliesNeeded;
    
    //constructors
    
    //without any suppliesNeeded
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    //with suppliesNeeded
    public Product(String name, double price, List<Supply> supplies){
        this.name = name;
        this.price = price;
        suppliesNeeded = supplies;
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
    
    //returns List<Supply> suppliesNeeded
    public List<Supply> getSupplies(){
        return suppliesNeeded;
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
    
    //input List<Supply> supplies
    //sets suppliesNeeded to given List<Supply>
    public void setSupplies(List<Supply> supplies){
        suppliesNeeded = supplies;
    }
    
    //input Supply supplyToAdd
    //adds given Supply to the suppliesNeeded list
    public void addSupplyNeeded(Supply supplyToAdd){
        suppliesNeeded.add(supplyToAdd);
    }
    
    //input Supply supplyToRemove
    //removes given Supply from suppliesNeeded list
    public boolean removeSupplyNeeded(String supplyToRemove){
        return suppliesNeeded.remove(findSupply(supplyToRemove));
    }
    
    //input target String
    //finds Supply in list with name = target
    //returns Supply found
    private Supply findSupply(String target){
        for(Supply supply : suppliesNeeded){
            if(supply.getName().equalsIgnoreCase(target))
                return supply;
        }
        return null;
    }
}
