package Open_Closed.Open;
/**

*/
public class Order{
    protected String customer;
    protected int total;

    public Order(String customer, int total){
        this.customer = customer;
        this.total = total;
    }


    public static void main(String[] args) {
        Invoice invoice = new Invoice("Google", 100);
        System.out.println(invoice);
        BillOfLading BOL = new BillOfLading("Yahoo", 200, "Klaarbeeklaan 23");
        System.out.println(BOL);
    }
}
