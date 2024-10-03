public class Main {
    public static void main(String[] args) {
    Book book = new Book("OOP2.2");
    book.setPrice(100000.67);
    book.setQty(1);
    Author author = new Author("Phan Quốc Huy", "huy.pq24gite@vku.udn.vn", 'm');
    book.setAuthor(author);
    System.out.println("name " + book.getName());
    System.out.println("Author " + book.getAuthor());
    System.out.println("price " + book.getPrice());
    System.out.println("qty " + book.getQty());
    }
}
