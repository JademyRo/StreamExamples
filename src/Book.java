public class Book {

    private String title;
    private String genre;
    private boolean isLoaned;
    private int loanNumber;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public Book(String title, String genre, boolean isLoaned, int loanNumber) {
        this.title = title;
        this.genre = genre;
        this.isLoaned = isLoaned;
        this.loanNumber = loanNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }
}
