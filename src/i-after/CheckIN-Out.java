package i.after;

import java.time.LocalDateTime;

public interface CheckIn-Out {
    void checkIn();
    void checkOut(String borrower);
    LocalDateTime getDueDate();
}
