//import of package
import java.util.ArrayList;


public class BookStore {
    //the message has been provided for you - do not change this
    private final String message = "The urgent orders are piling up .... time to ship quicker";
    //create the invoices ArrayList<>
    public ArrayList<Invoice> invoices;

    //complete the constructor

    public BookStore() {
        this.invoices = new ArrayList<Invoice>();
    }

    //getter() for invoices list

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }


    //search for an order
    public Invoice searchOrder(String invoiceNbr){
        Invoice Varv1=null;
        for (Invoice Varv2:getInvoices()){
            if (Varv2.getInvoiceNbr()==invoiceNbr){
                Varv1=Varv2;
            }

        }
        return Varv1;
    }

    //piling up of orders
    public String pilingUpOfOrders(){
        if (Shipping.countUrgent>5){
            return message;
        }
        else return null;
    }

}
