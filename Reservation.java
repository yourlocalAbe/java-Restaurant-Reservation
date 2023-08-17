public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  
  public Reservation(int count, int capacity, boolean open) {
    if (open) {
      System.out.println("Restaurant is open! please come with empty stomach.");
    } else {
      System.out.println("Sorry the restaurant is closed, please come again tomorrow!");
      return;
    }
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    // Create instances here
    Reservation pelanggan = new Reservation(3, 5, true);
    int jmlPelanggan = pelanggan.guestCount;
    int kapasitas = pelanggan.restaurantCapacity;
    boolean bukatidak = pelanggan.isRestaurantOpen;
    System.out.println("amount of customer " + jmlPelanggan);
    System.out.println("table capacity " + kapasitas);
    System.out.println(bukatidak);

    pelanggan.confirmReservation();
    pelanggan.informUser();
  }
}