package live.coding;

import java.util.Comparator;

public class HouseColorDescComparator implements Comparator<House> {

  @Override
  public int compare(House o1, House o2) {
    return o2.getColor().compareTo(o1.getColor());
  }

}
