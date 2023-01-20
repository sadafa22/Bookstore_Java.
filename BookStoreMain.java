import java.time.LocalDate;

public class BookStoreMain {
    public static void main(String[] args) {
        //create a bookStore object and instantiate
        BookStore bookStore=new BookStore();

        //create a customer who can then buy books
        Customer c1=new Customer("Amaya","123 472 786","amaya23@gmail.com");


        //customer1 places an order to purchase a book
        Stock stock1=new Stock("Matilda","Renault",400);

        //placing the order ****
        Order order1=new Order(c1,stock1);



        //determine the shipping date
        int year=2020;
        int month=4;
        int date=23;
        LocalDate shippingDate=LocalDate.of(2020,4,23);




        //calculate the shipping cost to send the order
        Shipping shipOrder1=new Shipping(order1,shippingDate);
        shipOrder1.calcShipCost(false);




        //create an invoice ****
        Invoice invoice=new Invoice("SDR7865",stock1,shipOrder1);
        invoice.invoice();



        //add the invoices to a list so that we can search for an invoice ****
        bookStore.getInvoices().add(invoice);

        //a repeat with another customer, order, etc...
        Customer c2=new Customer("Lala","675 345 567","lala28@gmail.com");
        Stock stock2=new Stock("Freddy","Noddy",900);
        Order order2=new Order(c2,stock2);


        //determine the shipping date
        int yr=2021;
        int mnt=7;
        int dte=6;
        LocalDate shippingDate2=LocalDate.of(2020,4,23);


        //calculate the shipping cost to send the order
        Shipping shipOrder2=new Shipping(order1,shippingDate);
        shipOrder2.calcShipCost(false);



        //create an invoice

        Invoice invoice2=new Invoice("YTG786",stock2,shipOrder1);
        invoice.invoice();


        //add the invoices to a list so that we can search for an invoice
        bookStore.getInvoices().add(invoice2);


        //search for order
        Invoice foundInvoice=bookStore.searchOrder(invoice2.getInvoiceNbr());
    }
}

