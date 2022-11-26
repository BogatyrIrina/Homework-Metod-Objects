public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Федор", "Достоевский");
        System.out.println("author1.getName() = " + author1.getName());
        System.out.println("author1.getSurname() = " + author1.getSurname());

        Book book1 = new Book("Преступление и наказание", author1, 1995);
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getPublicationDate() = " + book1.getPublicationDate());

        book1.setPublicationDate(1992);
        Book book3 = new Book("Преступление и наказание", author1, 1992);
        System.out.println("book1.getPublicationDate() = " + book1.getPublicationDate());

        Author author2 = new Author("Шарлотта", "Бронте");
        System.out.println("author2.getName() = " + author2.getName());
        System.out.println("author2.getSurname() = " + author2.getSurname());

        Book book2 = new Book("Джэйн Эйр", author2, 1990);
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getPublicationDate() = " + book2.getPublicationDate());

        book2.setPublicationDate(1989);
        System.out.println("book2.getPublicationDate() = " + book2.getPublicationDate());

        System.out.println(book1);
        System.out.println(author1);

        boolean result = book1.equals(book3);
        System.out.println(result);
    }
}