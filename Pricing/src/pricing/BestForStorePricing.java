/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author jan
 */
public class BestForStorePricing extends ComplexPricing {
    
    public BestForStorePricing(ISalePricing pricing) {
        super.add(pricing);
    }
    
    
}
