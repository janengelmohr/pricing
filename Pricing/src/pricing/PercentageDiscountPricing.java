/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author jan
 */
public class PercentageDiscountPricing implements ISalePricing {
    
    private double percentage;
    
    public PercentageDiscountPricing(double percentage) {
        this.percentage = percentage;
    }
    
    public double getTotal(Sale sale) {
        return (sale.getPreDiscountTotal() * (percentage/100));
    }
}
