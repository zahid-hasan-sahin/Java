package Library;

public class BookDB {

    public Book getBook(String name) {
        Book book = new Book();
        book.setName(name);
        if (name.equalsIgnoreCase("java")) {
            book.setDescription("java is good");
            book.setPrice(12);
        } else if (name.equalsIgnoreCase("Php")) {
            book.setDescription("Php is good");
            book.setPrice(20);
        }else{
            book.setDescription("unknown");
            book.setPrice(0);
        }
        return book;
    }
}
