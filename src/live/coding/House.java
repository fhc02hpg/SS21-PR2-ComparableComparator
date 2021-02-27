package live.coding;

import java.util.Objects;

public class House implements Comparable<House> {

  private int rooms;
  private String color;
  private int squareMeters;
  private int year;

  public House(int rooms, String color, int squareMeters, int year) {
    this.rooms = rooms;
    this.color = color;
    this.squareMeters = squareMeters;
    this.year = year;
  }

  public int getRooms() {
    return rooms;
  }

  public void setRooms(int rooms) {
    this.rooms = rooms;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSquareMeters() {
    return squareMeters;
  }

  public void setSquareMeters(int squareMeters) {
    this.squareMeters = squareMeters;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }



  @Override
  public String toString() {
    return "House{" +
        "rooms=" + rooms +
        ", color='" + color + '\'' +
        ", squareMeters=" + squareMeters +
        ", year=" + year +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof House)) {
      return false;
    }
    House house = (House) o;
    return rooms == house.rooms;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms);
  }

  @Override
  public int compareTo(House o) {
    /*if (this.rooms < o.rooms)
      return -1;
    if (this.rooms > o.rooms)
      return 1;
    return 0;*/
    return Integer.compare(this.rooms,o.rooms);
  }
}
