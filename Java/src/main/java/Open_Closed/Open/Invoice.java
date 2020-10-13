package Open_Closed.Open;

public class Invoice extends Order{
    public Invoice(String customer, int total) {
        super(customer, total);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer='" + customer + '\'' +
                ", total=" + total +
                '}';
    }

    //    public String toString(){
//        System.out.println("Invoice");
//        System.out.println(super.customer);
//        System.out.println(super.total);
//    }
}
