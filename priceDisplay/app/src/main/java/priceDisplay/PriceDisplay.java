package priceDisplay;

public class PriceDisplay {
  public static void main(String[] args) {
    PriceDisplay price = new PriceDisplay();
    System.out.println(price.getPriceLabel("Coffee Machine", 15.99));
  }

  public String getPriceLabel(String item, double price) {
    return "The price of the item " + item + " is " + price;
  }
}