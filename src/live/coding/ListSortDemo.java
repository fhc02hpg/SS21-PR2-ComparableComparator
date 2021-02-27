package live.coding;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {

  public static void main(String[] args) {

    ArrayList<House> houseList = new ArrayList<>();
    houseList.add(new House(5,"white",90,1980));
    houseList.add(new House(7,"blue",160,2010));
    houseList.add(new House(9,"yellow",250,1990));
    houseList.add(new House(4,"red",80,2020));
    houseList.add(new House(6,"red",120,2017));

    System.out.println("LIST SORTING of houses");

    System.out.println(houseList);
    Collections.sort(houseList);
    System.out.println(houseList);

    //Collections.sort(houseList,new HouseColorDescComparator());
    houseList.sort(new HouseColorDescComparator());
    System.out.println(houseList);

    houseList.sort(new HouseColorYearComparator());
    System.out.println(houseList);

  }

}
