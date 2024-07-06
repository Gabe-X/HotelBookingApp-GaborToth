package rooms;

import java.time.LocalDate;

public abstract class AbstractRoom {
    boolean isExtraBedNeeded;
    int ExtraBedPrice;
    private int seasonBasedPrice;

    int getSeasonBasedDefaultPrice() {
        LocalDate now = LocalDate.now();
        LocalDate date1 = LocalDate.of(2024, 3, 1);
        LocalDate date2 = LocalDate.of(2024, 5, 31);
        LocalDate date3 = LocalDate.of(2024, 6, 1);
        LocalDate date4 = LocalDate.of(2024, 8, 31);
        LocalDate date5 = LocalDate.of(2024, 9, 1);
        LocalDate date6 = LocalDate.of(2024, 11, 31);
        LocalDate date7 = LocalDate.of(2024, 11, 30);
        LocalDate date8 = LocalDate.of(2025, 2, 28);

        if (now.isAfter(date1) && now.isBefore(date2)) {
            seasonBasedPrice = 11000;
        } else if
        (now.isAfter(date3) && now.isBefore(date4)) {
            seasonBasedPrice = 21000;
        } else if
        (now.isAfter(date5) && now.isBefore(date6)) {
            seasonBasedPrice = 21000;
        } else if
        (now.isAfter(date7) && now.isBefore(date8)) {
            seasonBasedPrice = 11000;
        }
        return seasonBasedPrice;
    }


    abstract int calculateRoomPrice();

    @Override
    public String toString() {
        return "AbstractRoom{" +
                "isExtraBedNeeded=" + isExtraBedNeeded +
                ", isExtraBedPrice=" + ExtraBedPrice +
                ", seasonBasedPrice=" + seasonBasedPrice +
                '}';
    }
}
