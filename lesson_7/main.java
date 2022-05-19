public class Book {
    public String name;
    public int title;
    public String author;
    public int rating;

    public static int maxRating = 0;
    public static int maxTitle = 0;
    int bookMark = 0;

    public int getBookMark() {
        return bookMark;
    }

    public void setBookMark(int bookMark) {
        if (bookMark > maxTitle){
            this.bookMark = maxTitle;
        } else {
            this.bookMark = bookMark;
        }
    }

    public Book(String name, int title, String author, int rating){
        this.name = name;
        this.title = title;
        this.author = author;
        this.rating = rating;
        if (rating > maxRating)
            maxRating = rating;
        if (title > maxTitle)
            maxTitle = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", title=" + title +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                ", bookMark=" + bookMark +
                '}';
    }
}
