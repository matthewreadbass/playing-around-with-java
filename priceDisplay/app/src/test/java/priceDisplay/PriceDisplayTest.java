package priceDisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test public void testPriceDisplay() {
    PriceDisplay price = new PriceDisplay();
    assertEquals("Will display the price of the item", String.valueOf("The price of the item Coffee machine is 15.99"), price.getPriceLabel("Coffee machine", 15.99));
  }
}