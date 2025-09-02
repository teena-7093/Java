package day_2;

public class Product {
	 String pname;
     int price;
     double gst;
     int discount,quantity;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product p1 = new Product();
      p1.pname= "AC";
      p1.price = 120000;
      p1.gst=243.09;
      p1.discount = 10000;
      p1.quantity = 14;
      System.out.println("Product name : "+p1.pname);
      System.out.println("Product price : "+p1.price);
      System.out.println("Product gst : "+p1.gst);
      System.out.println("Product discount : "+p1.discount);
      System.out.println("Product quantity : "+p1.quantity);
      System.out.println();
      Product p2 = new Product();
      p2.pname= "Fan";
      p2.price = 12000;
      p2.gst=24.09;
      p2.discount = 100;
      p2.quantity = 9;
      System.out.println("Product name : "+p2.pname);
      System.out.println("Product price : "+p2.price);
      System.out.println("Product gst : "+p2.gst);
      System.out.println("Product discount : "+p2.discount);
      System.out.println("Product quantity : "+p2.quantity);
      System.out.println();
	}
}
