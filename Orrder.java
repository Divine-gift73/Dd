public class Orrder{
  boolean isFilled;
  double productCost;
  String shipping;

  public Orrder(boolean filled, double cost, String method){
 isFilled = filled;
 productCost = cost;
 shipping = method;
  }

  public void ship(){
    if (productCost > 2.00){
      System.out.println("High value item! ");
    }else{
      System.out.println("Low value item! ");
    }
    if (isFilled){
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + shippingCost());
      System.out.println("Subtotal cost: " + (shippingCost() + productCost));

    }else{
      System.out.println("Can't find order");
 }

  }

 public double shippingCost(){
   if (shipping.equals("regular")){
     return 1.99;
   }else if(shipping.equals("express")){
     return 1.75;
   }else{
    return 1.50;
   }

 }

 public static void main(String [] args){
   Orrder mathsNote = new Orrder(true, 3.99, "regular");
   Orrder englishNote = new Orrder(true, 4.99, "express");
   Orrder physicsNote = new Orrder(false, 4.99, "express");
   mathsNote.ship();
   englishNote.ship();
   physicsNote.ship();

 
    
  }
}