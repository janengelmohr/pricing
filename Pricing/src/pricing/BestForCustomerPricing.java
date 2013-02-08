/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author jan
 */
public class BestForCustomerPricing extends ComplexPricing {
    
    public BestForCustomerPricing(ISalePricing pricing) {
        super.add(pricing);
    }
    
    public double getTotal() {
        for(ISalePricing p : super.pricings) 
    }
}
