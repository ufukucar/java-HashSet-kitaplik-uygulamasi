import java.util.Scanner;

class Main {

    static Scanner scanner = new Scanner(System.in);

    static Library lib = new Library();

    public static void main(String[] args) {

        System.out.println("**************** Program Başlıyor ****************");
        int counter = 0;
        while (true) {

            System.out.println(
                    "\n\n Kitap eklemek için e, \n listelemek için l, \n Temizlemek için t, \n Çıkmak için q ya basınız \n");

            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("\n Sistemden çıkılıyor...");
                System.exit(0);
            }

            islemYap(input, counter);
            counter++;
        }

    }

    static void islemYap(String input, int counter) {

        switch (input) {
            case "e":
                System.out.println("\nLütfen kitap adını giriniz: ");
                String name = scanner.nextLine();
                System.out.println("\nLütfen yazar adını giriniz:");
                String author = scanner.nextLine();
                System.out.println("Lütfen Yayıncayı giriniz: ");
                String publisher = scanner.nextLine();
                System.out.println("\nLütfen miktarını giriniz");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                lib.addBook(new Book(counter + 1, name, author, publisher, quantity));

                System.out.println("Kitaplıkta " + lib.getCount() + " adet kitap var");
                break;

            case "l":
                lib.print();
                break;

            case "t":
                lib.clearLibrary();
                break;

            default:
                System.exit(0);
                break;
        }

    }

}