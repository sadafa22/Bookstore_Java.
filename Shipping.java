//import to be included
import java.time.LocalDate;


public class Shipping{
    private LocalDate shipDate;
    private Order order;
    private double shipCost;
    public static int countUrgent;


    public Shipping(Order order, LocalDate shipDate) {
        this.shipDate = shipDate;
        this.order = order;

    }
    public LocalDate getShipDate() {
        return this.shipDate;
    }

    public double getShipCost() {
        return this.shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }
    public double calcShipCost(boolean isUrgent) {
        if (isUrgent) {
            this.shipCost=5.45;
            countUrgent++;
        }
        else{
            this.shipCost=3.95;
        }
        return this.shipCost;
    }




    }


