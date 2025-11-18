package test3;

public class Goods {
   private String id;
   private String name;
   private double price;
   private int count;

   public Goods() {

   }

   public Goods(String id, String name, double price, int count) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.count = count;
   }

   /**
    * @return String return the id
    */
   public String getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id) {
      this.id = id;
   }

   /**
    * @return String return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * @return double return the price
    */
   public double getPrice() {
      return price;
   }

   /**
    * @param price the price to set
    */
   public void setPrice(double price) {
      this.price = price;
   }

   /**
    * @return int return the count
    */
   public int getCount() {
      return count;
   }

   /**
    * @param count the count to set
    */
   public void setCount(int count) {
      this.count = count;
   }

}
