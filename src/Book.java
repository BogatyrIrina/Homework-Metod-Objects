public class Book {
    private String name;
    private Author author;
    private int publicationDate;

    public Book(String nameBook, Author author, int publicationDate) {
        this.name = nameBook;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name) && author.equals(book.author)
                && publicationDate == book.publicationDate;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.name, this.author, this.publicationDate);
    }

    @Override
    public String toString() {
        return "Название " + this.name + " Год издания " + this.publicationDate;
    }
}