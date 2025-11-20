public class Save {
    private String title;      // 도서명
    private String author;     // 저자
    private String publisher;  // 출판사
    private int year;          // 출판 연도

    public Save(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
}

