/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matador;

import java.lang.UnsupportedOperationException;
/**
 *
 * @author Nicolai
 */
public class Street extends Field implements ILease {
    
    private int[] leasePrices; // Index 2 in this array is equal to having 2 Houses etc.
    private int numberOfHouses = 0;
    private final int maxHouses = 5; // Value of field can't be changed
    private UpgradeableDeed deed;
    
    public Street(String name, Zone zone, UpgradeableDeed deed, int[] leasePrices)
    {
        super(name, zone);
        this.deed = deed;
        this.leasePrices = leasePrices;
    }
    
    public void addHouse()
    {
        if (this.numberOfHouses > 5)
            throw new UnsupportedOperationException();
         this.numberOfHouses += 1;
    }
    
    public int getNumberOfHouses()
    {
        return this.numberOfHouses;
    }
    
    public int getLease()
    {
        return this.leasePrices[this.numberOfHouses];
    }
    
    public Deed getDeed()
    {
        return this.deed;
    }
    

    
}
