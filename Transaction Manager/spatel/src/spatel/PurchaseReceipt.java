/**
 * Interface for Transactions
 *
 * @author   Sagar Patel
 * @version  1.0 2/27/2019
 */

package spatel;

public interface PurchaseReceipt extends Comparable<PurchaseReceipt> {
    public int getId( );
    public String getBuyer( );
    public String getSeller( );
    public double getPrice( );
    public String toString( );
}
