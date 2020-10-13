package Open_Closed.Open;

public class BillOfLading extends Order{
    private String adres;

    public BillOfLading(String customer, int total, String adres) {
        super(customer, total);
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "BillOfLading{" +
                "customer='" + customer + '\'' +
                ", total=" + total +
                ", adres='" + adres + '\'' +
                '}';
    }
}
