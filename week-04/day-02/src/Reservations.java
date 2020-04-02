import static reservations.Reservation.confirmBooked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import reservations.HorseWhisperer;
import reservations.Reservation;
import reservations.Slot;

public class Reservations {
  public static void main(String[] args) {

    Reservation guestSlot1 = new Reservation(HorseWhisperer.ROBERT, Slot.AFTERNOON, true, false);
    Reservation guestSlot2 = new Reservation(HorseWhisperer.ROBERT, Slot.MORNING, true, false);
    Reservation guestSlot3 = new Reservation(HorseWhisperer.KRISTIN, Slot.AFTERNOON, true, false);
    Reservation guestSlot4 = new Reservation(HorseWhisperer.KRISTIN, Slot.AFTERNOON, true, false);
    Reservation guestSlot5 = new Reservation(HorseWhisperer.SCARLETT, Slot.MORNING, true, false);
    Reservation guestSlot6 = new Reservation(HorseWhisperer.SCARLETT, Slot.AFTERNOON, true, false);
    Reservation guestSlot7 = new Reservation(HorseWhisperer.SCARLETT, Slot.AFTERNOON, false, false);
    Reservation guestSlot8 = new Reservation(HorseWhisperer.ROBERT, Slot.AFTERNOON, false, true);
    Reservation guestSlot9 = new Reservation(HorseWhisperer.KRISTIN, Slot.MORNING, false, true);

    List<Reservation> reservationList = new ArrayList<>();

    reservationList.addAll(Arrays.asList(guestSlot1, guestSlot2, guestSlot3, guestSlot4,
        guestSlot5, guestSlot6, guestSlot7, guestSlot8, guestSlot9));

    confirmBooked(reservationList);

    for (Reservation res : reservationList) {
      if (res.isConfirmed()) {
        System.out.println("Booking# " + String.format("%S", res.getCodeBooking()) + " for " + res.getDowBooking());
      } else {
        continue;
      }
    }

  }
}
