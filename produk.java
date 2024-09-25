public class produk {

  private int number;
  private String name;
  private int quantity;
  private double price;

  public produk() {
    name = "faddli";
    number = 0;
    quantity = 0;
    price = 0.0;
  }

  public produk(int number, String name, int quantity, double price) {

    this.number = number;
    this.name = name;
    this.quantity = quantity;
    this.price = price;

  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int value) {
    this.number = value;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int value) {
    this.quantity = value;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double value) {
    this.price = value;
  }

  public void print() {
    System.out.println("number" + number);
    System.out.println("nama = " + name);
    System.out.println("quantity = " + quantity);
    System.out.println("price = " + price);
  }
}
