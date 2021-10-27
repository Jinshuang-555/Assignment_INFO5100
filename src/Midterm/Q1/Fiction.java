package Midterm.Q1;

public class Fiction extends Book implements iBorrowable{
    int borrowDate;
    int returnDate;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return "Frankenstein(title) all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if (day<=returnDate && day>=borrowDate) {
            return false;
        }
        return true;
    }
}
