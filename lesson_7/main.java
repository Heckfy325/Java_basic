public class Main {

    public static void main(String[] args) {

        System.out.println("Сравнение книг " + Book.maxRating);
        Book book1 = new Book("Test1", 99, "JonhB", 5);
        Book book2 = new Book("Test1", 78, "BobyB", 3);
        book1.setBookMark(56);
        System.out.println("Книга 1 " + book1);
        System.out.println("Книга 2 " + book2);
        System.out.println("Равны ли книги? " + book1.equals(book2));
        System.out.println("В какой книге больше страниц? " + Book.maxTitle);
        System.out.println("Результат сравнения " + book1.equals(book2));
        }
    }
