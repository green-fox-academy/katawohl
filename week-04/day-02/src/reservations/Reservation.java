package reservations;

import java.util.List;
import java.util.Random;

public class Reservation implements Confirmable {
  private HorseWhisperer horseWhisperer;
  private Slot slot;
  private boolean isBooked;
  private boolean isConfirmed;

  public Reservation(HorseWhisperer horseWhisperer, Slot slot, boolean isBooked,
                     boolean isConfirmed) {
    this.horseWhisperer = horseWhisperer;
    this.slot = slot;
    this.isBooked = isBooked;
    this.isConfirmed = isConfirmed;
  }

  public boolean searchCrash(Reservation res) {
    if (this.horseWhisperer == res.horseWhisperer && this.slot == res.slot && this.isBooked == res.isBooked) {
      return true;
    } else {
      return false;
    }
  }

  public static void confirmBooked(List<Reservation> reservationList) {
    for (Reservation res : reservationList) {
      for (int i = 0; i < reservationList.size(); i++) {
        if (res != reservationList.get(i) && !res.searchCrash(reservationList.get(i))) {
          res.isConfirmed = true;
        } else {
          res.isConfirmed = false;
        }
      }
    }
  }

  static String getAlphaNumericString(int n) {
    Random random = new Random();
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "0123456789"
        + "abcdefghijklmnopqrstuvxyz";

    String resCode = "";

    for (int i = 0; i < n; i++) {
      int index = random.nextInt(AlphaNumericString.length());

      resCode += AlphaNumericString.charAt(index);
    }
    return resCode;
  }

  static String getADay() {
    Random random = new Random();
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    String dayToBook = days[random.nextInt(days.length)];

    return dayToBook;
  }

  @Override
  public String getDowBooking() {
    if (this.isConfirmed) {
      return getADay();
    } else {
      return "no day confirmed";
    }
  }

  @Override
  public String getCodeBooking() {
    if (this.isConfirmed) {
      return getAlphaNumericString(8);
    } else {
      return "No reservation number confirmed";
    }
  }
}