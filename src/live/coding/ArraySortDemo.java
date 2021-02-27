package live.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo {

  public static void main(String[] args) {

    int[] nums = {7,-10,23,66,-5,100};
    System.out.println(Arrays.toString(nums));

    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    String[] names = {"John","Eva","Bruce","Eliah","Keanu"};
    System.out.println(Arrays.toString(names));
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));

    House[] houses = {
        new House(5,"white",90,1980),
        new House(7,"blue",160,2010),
        new House(9,"yellow",250,1990),
        new House(4,"red",80,2020)
    };

    System.out.println(Arrays.toString(houses));
    Arrays.sort(houses);
    System.out.println(Arrays.toString(houses));

  }

}
