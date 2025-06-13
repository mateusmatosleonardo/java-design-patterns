package factory_method;

import java.util.*;

public abstract class OrderProcessor {

  public void removeInvalidItems(Collection<OrderItem> items) {
    Iterator<OrderItem> iterator = items.iterator();
    while (iterator.hasNext()) {
      OrderItem item = iterator.next();
      if (!isValid(item)) {
        iterator.remove();
      }
    }
  }

  private boolean isValid(OrderItem item) {
    return item.getQuantity() > 0 && item.getQuantity() < 100;
  }
}
