package factory_method;

import java.util.*;

public class Processor extends OrderProcessor {

  public static void main(String[] args) {
    OrderItem item1 = new OrderItem("Café", 2, 500);     // valid
    OrderItem item2 = new OrderItem("Pão", 0, 200);      // invalid (quantity 0)
    OrderItem item3 = new OrderItem("Leite", 101, 400);  // invalid (quantity > 100)
    OrderItem item4 = new OrderItem("Açúcar", 5, 300);   // valid

    // Cria a lista de itens
    Collection<OrderItem> items = new ArrayList<>();
    items.add(item1);
    items.add(item2);
    items.add(item3);
    items.add(item4);

    System.out.println("Before:");
    for (OrderItem item : items) {
      System.out.println(item.getProduct() + " - Quantidade: " + item.getQuantity());
    }

    Processor processor = new Processor();
    processor.removeInvalidItems(items);

    System.out.println("\nAfter:");
    for (OrderItem item : items) {
      System.out.println(item.getProduct() + " - Quantidade: " + item.getQuantity());
    }
  }

}
