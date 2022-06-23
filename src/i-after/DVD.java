package i.after;

import java.time.LocalDateTime;
import java.util.List;

public class DVD implements  LibraryItem, CheckIn {
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;
    List<String> actors;
    int runtimeInMinutes;

    @Override
    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    @Override
    public List<String> getActors() {
        return actors;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return -1;
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
        return 14;
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
    public int getRunTimeInMinutes() {
        return 0;
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
