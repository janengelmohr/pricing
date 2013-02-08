/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author jan
 */
public class Sale implements DiscountType {
    
    private double preDiscountTotal;
    private ISalePricing myPricing;
    
    public Sale(double preDiscountTotal) {
        this.preDiscountTotal = preDiscountTotal;
    }
    
    public double getTotal() {
        myPricing.
    }
    
    public ISalePricing createPricing(int discountType, double percentage, double discount, double threshold) {
        if(discountType==1) {
            return new PercentageDiscountPricing(percentage);
        }
        return new AbsoluteDiscountPricing(discount, threshold);
    }
    
    public double getPreDiscountTotal() {
        return this.preDiscountTotal;
    }
    
    public void setPricing(ISalePricing pricing) {
        myPricing = pricing;
    }
}
