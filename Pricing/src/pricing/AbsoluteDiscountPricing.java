/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author jan
 */
public class AbsoluteDiscountPricing implements ISalePricing {
    
    private double threshold;
    private double discount;
    
    public AbsoluteDiscountPricing(double discount, double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }
    
    public double getTotal(Sale sale) {
        double total = sale.getPreDiscountTotal();
        if((total<threshold)||(total-discount<threshold)) {
            return total;
        }
        return (total-discount);
    }
}
