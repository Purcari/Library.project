public class Books {

private int year;
private String domain;
private String title;
private String author;
private boolean stock;


 public Books(String domain, String title, String author, int year, boolean stock) {
    this.domain = domain;
    this.title = title;
    this.author = author;
    this.year = year;
    this.stock = stock;
}



    public Books() {

    }

    public String getDomain(String domain) {
        return this.domain;
    }

    public String getTitle(String title) {
        return this.title;
    }

    public String getAuthor(String author) {
     return this.author;
    }
    public int getYear(int year) {
     return this.year;
    }

}




