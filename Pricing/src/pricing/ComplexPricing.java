/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jan
 */
 abstract class ComplexPricing implements ISalePricing {
     
     protected Set<ISalePricing> pricings = new HashSet();
    
     public void add(ISalePricing pricing) {
         pricings.add(pricing);
     }
     
     abstract double getTotal();
}
