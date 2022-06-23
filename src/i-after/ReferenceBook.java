package i.after;

import java.time.LocalDateTime;
import java.util.List;

public abstract class ReferenceBook implements LibraryItem, CheckIn  {
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public int getRuntimeInMinutes() {
        return 0;
    }

    @Override
    public List<String> getActors() {
        return null;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 0;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void checkout(String borrower) {

    }

    @Override
    public int getRunTimeInMinutes() {
        return 0;
    }

    @Override
    public void checkOut(String borrower) {
        throw new UnsupportedOperationException();
    }

    public abstract void Out();

    @Override
    public LocalDateTime getDueDate() {
        throw new UnsupportedOperationException();
    }
}
