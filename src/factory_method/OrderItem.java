package factory_method;

public class OrderItem {

  private String product;
  private int quantity;
  private int unitPriceInCents;

  public OrderItem(String product, int quantity, int unitPriceInCents) {
    this.product = product;
    this.quantity = quantity;
    this.unitPriceInCents = unitPriceInCents;
  }

  public int totalValue() {
    return quantity * unitPriceInCents;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getUnitPriceInCents() {
    return unitPriceInCents;
  }

  public void setUnitPriceInCents(int unitPriceInCents) {
    this.unitPriceInCents = unitPriceInCents;
  }
}
