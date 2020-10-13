package Open_Closed.Closed;
/**
Dit stuk code volgt niet het open closed principe. Stel je wilt aan dit voorbeeld een adres toevoegen.
 Dan moet dit op 4 plekken worden aangepast.
*/
public class Order {
    private String customer;
    private int total;

    public Order(String customer, int total){
        this.customer = customer;
        this.total = total;
    }

    public void invoice(){
        System.out.println("Invoice");
        System.out.println(this.customer);
        System.out.println(this.total);
    }

    public void bill_of_lading(){
        System.out.println("BOL");
        System.out.println(this.customer);
        System.out.println("Shipping Label...");
    }

    public static void main(String[] args) {
        Order order = new Order("google", 100);
        order.invoice();
        order.bill_of_lading();
    }
}
