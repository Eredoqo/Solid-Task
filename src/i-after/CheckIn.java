package i.after;

public interface CheckIn {

        void checkIn();

        void checkout(String borrower);

        int getRunTimeInMinutes();

        int getCheckOutDurationInDays();

        void checkOut(String borrower);

        void Out();
}