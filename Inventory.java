/**
 *
 * @author Darkw
 */

import java.util.List;

public class Inventory {
    
    //instance variables
    private List<Product> products;
    private List<Supply> supplies;
    
    //constructors
    
    //empty constructor
    public Inventory(){
    }
    
    //full constructor
    public Inventory(List<Supply> supplies, List<Product> products){
        this.supplies = supplies;
        this.products = products;
    }
    
    //get functions
    
    //returns List<Product> products
    public List<Product> getProducts(){
        return products;
    }
    
    //returns List<Supply> supplies
    public List<Supply> getSupplies(){
        return supplies;
    }
    
    //input Product productToAdd
    //adds product to list of products
    public void addProduct(Product productToAdd){
        products.add(productToAdd);
    }
    
    //input String productToRemove
    //removes product if in product list
    //returns true if successful
    public boolean removeProduct(String productToRemove){
        return products.remove(findProduct(productToRemove));
    }
    
    //input String target
    //finds Product with name = target
    //returns Product found
    private Product findProduct(String target){
        for(Product product : products){
            if(product.getName().equalsIgnoreCase(target))
                return product;
        }
        return null;
    }
    
    //input Supply supplyToAdd
    //adds supply to list of supplies
    public void addSupply(Supply supplyToAdd){
        supplies.add(supplyToAdd);
    }
    
    //input String supplyToRemove
    //removes supply if in supply list
    //returns true if successful
    public boolean removeSupply(String supplyToRemove){
        return products.remove(findSupply(supplyToRemove));
    }
    
    //input String target
    //finds Supply with name = target
    //returns Supply found
    private Supply findSupply(String target){
        for(Supply supply : supplies){
            if(supply.getName().equalsIgnoreCase(target))
                return supply;
        }
        return null;
    }
}
