import prBookShop.*;

public class BookShopTest {

    public static void main(String[] args) {

        BookShop testBookShop = new BookShop();

        testBookShop.addBook("george orwell", "1984", 8.20);
        testBookShop.addBook("Philip K. Dick", "Suenan los androides con ovejas electricas?", 3.50);
        testBookShop.addBook("Isaac Asimov", "Fundacion e Imperio", 9.40);
        testBookShop.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
        testBookShop.addBook("Alex Huxley", "Un Mundo Feliz", 6.50);
        testBookShop.addBook("Isaac Asimov", "La Fundacion", 7.30);
        testBookShop.addBook("William Gibson", "Neuromante", 8.30);
        testBookShop.addBook("Isaac Asimov", "Segunda Fundacion", 8.10);
        testBookShop.addBook("Isaac Newton", "arithmetica universalis", 7.50);
        testBookShop.addBook("George Orwell", "1984", 6.20);
        testBookShop.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);

        System.out.println(testBookShop.toString());

        testBookShop.deleteBook("George Orwell", "1984");
        testBookShop.deleteBook("Alex Huxley", "Un Mundo Feliz");
        testBookShop.deleteBook("Isaac Newton", "Arithmetica Universalis");

        System.out.println();
        System.out.println();
        System.out.println(testBookShop.toString());
        System.out.println();
        System.out.println();

        System.out.println(testBookShop.getAmountDue("George Orwell", "1984"));
        System.out.println(testBookShop.getAmountDue("Philip K. Dick", "Suenan los androides con ovejas electricas?"));
        System.out.println(testBookShop.getAmountDue("isaac asimov", "Fundacion e imperio"));
        System.out.println(testBookShop.getAmountDue("Ray Bradbury", "Fahrenheit 451"));
        System.out.println(testBookShop.getAmountDue("Alex Huxley", "Un Mundo Feliz"));
        System.out.println(testBookShop.getAmountDue("Isaac Asimov", "La Fundacion"));
        System.out.println(testBookShop.getAmountDue("william gibson", "neuromante"));
        System.out.println(testBookShop.getAmountDue("Isaac Asimov", "Segunda Fundacion"));
        System.out.println(testBookShop.getAmountDue("Isaac Newton", "Arithmetica Universalis"));

    }

}
