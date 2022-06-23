package i.after;

import java.time.LocalDateTime;
import java.util.List;

public interface LibraryItem {
    int getPages();

    int getRuntimeInMinutes();

    List<String> getActors();

    String getAuthor();

    LocalDateTime getBorrowDate();
    String getBorrower();
    int getCheckOutDurationInDays();
    String getLibraryId();
    String getTitle();

    LocalDateTime getDueDate();
}
