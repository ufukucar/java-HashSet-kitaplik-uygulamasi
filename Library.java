import java.util.HashSet;
import java.util.Iterator;

public class Library {

    private HashSet<Book> hashSet;

    public Library() {
        this.hashSet = new HashSet<Book>();
    }

    // Ekleme
    public void addBook(Book book) {
        this.hashSet.add(new Book(book));
        System.out.println("\n" + book.getName() + " adlı kitap eklendi.");
    }

    // Silme
    public void removeBook(Book book) {
        if (hashSet.isEmpty()) {
            System.out.println("Kayıtlı kitap bulunmuyor!");
        }
        this.hashSet.remove(book);
        System.out.println(book.getName() + " adlı kitap silindi.");
    }

    // Güncelleme
    public void updateBook(Book book, Book book2) {

        if (!hashSet.contains(book)) {
            System.out.println("Böyle bir kitap bulunmuyor!");
        }

        hashSet.remove(book);
        hashSet.add(book2);

        System.out.println("\nBaşarıyla güncellendi");

    }

    // getLastElement
    public int getLastElementId() {

        if (this.hashSet.isEmpty())
            return 1;
        return this.hashSet.toArray().length;
    }

    // Sıralama
    public void print() {

        if (this.hashSet.size() <= 0) {
            System.out.println("Kitap listeniz boş !!");
        } else {

            Iterator itr = hashSet.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println("\n******Kitaplar yazdırılıyor******\n");
        }

    }

    // Boşaltma
    public void clearLibrary() {
        hashSet.clear();
        System.out.println("\nKitaplık Boşaltıldı");
    }

    public int getCount() {
        return this.hashSet.size();
    }

}
