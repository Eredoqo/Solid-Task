package i.after;

import java.time.LocalDateTime;
import java.util.List;

public class AudioBook implements LibraryItem, CheckIn {
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;
    int runtimeInMinutes;

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getRunTimeInMinutes() {
        return runtimeInMinutes;
    }

    @Override
    public int getPages() {
        return -1;
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
        return checkOutDurationInDays;
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
        borrower = "";
    }

    @Override
    public void checkout(String borrower) {

    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public void Out() {

    }

    @Override
    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }
}
