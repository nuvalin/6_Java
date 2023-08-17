package book3.chapter2.chapter1;

public class Order {



    private double unitPrice;
    private double quantityOrdered;

//    public Order(double u, double p){
//        unitPrice = u;
//        quantityOrdered = p;
//    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }



    public double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }





 public  double getOrderTotal()
 {
     return unitPrice * quantityOrdered;
 }
}


