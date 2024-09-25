public class DVD extends produk {
  private String studio;
  private String rating;
  private int length;

public DVD(){
  studio = "";
  rating = "";
  length = 0;
  super.print();
}

public DVD(int length,String rating , String studio ,int number, String name, int quantity, double price){
  super( number,name, quantity, price);
  this.rating =  rating;
  this.studio = studio;
  this.length = length;
super.print();

}
  public String getStudio() {
    return this.studio;
  }

  public void setStudio(String value) {
    this.studio = value;
  }

  public String getRating() {
    return this.rating;
  }

  public void setRating(String value) {
    this.rating = value;
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int value) {
    this.length = value;
  }

  public void print() {
    super.print();

    System.out.println("studio = " + studio);
    System.out.println("Length" + length);
    System.out.println("rating = " + rating);
  }
}
