package sptv21libary;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;
import manager.BookManager;
import manager.ReaderManager;
        
/**
 *
 * @author User
 */


public class App {
    private Scanner scanner;
    private Book[] books;
    private Reader[] readers;
    private History[] histories;
    private Book book;
    private BookManager bookManager;
    private ReaderManager readerManager;
    private History historyManager;

    public App() {
        books = new Book[0];
        readers = new Reader[0];
        histories = new History[0];
        bookManager = new BookManager();
        readerManager = new ReaderManager();
    
    }
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do{
            System.out.println("Функции: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список выданных книг");
            System.out.println("6. Список книг");
            System.out.println("7. Список читателей");
            System.out.println("8. Редактировать книгу");
            System.out.println("9. Редактирование читателей");
            System.out.println("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    addBook(bookManager.createBookWithAuthors());
                    break;
                    
                case 2:
                    System.out.println("2. Добавить читателя");
                    addReader(readerManager.createReader());
                    break;
        
                case 3:
                    System.out.println("3. Выдать книгу");
                    addHistory(historyManager.takeOnBook(books, readers));
                    break;
                case 4:
                    System.out.println("4. Вернуть книгу");
                    histories = historyManager.returnBook(histories);
                    break;
            
                case 5:
                    System.out.println("5. Список выданных книг");
                    historyManager.printReadingBooks(histories);
                    break;
            
                case 6:
                    System.out.println("6. Список книг");
                    bookManager = new BookManager();
                    bookManager.printListBooks(books);
                    break;
            
                case 7:
                    System.out.println("Список читателей");
                    readerManager.printListReaders(readers);
                    break;
            
                case 8:
                    System.out.println("Список книг: ");
                    bookManager.printListBooks(books);
                    break;
                    
                case 9:
                    System.out.println("Редактирование читателей: ");
                    readerManager.changeReader(readers);
                    break;

                default:
                    System.out.println("Выберите задачу из списка!");
                    }                
            
            }while(repeat);
                System.out.println("Программа закрыта!");
    }
    
    private void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length+1);
        this.books[this.books.length - 1] = book;   
    }
    private void addReader(Reader reader) {
        this.readers = Arrays.copyOf(this.readers, this.readers.length+1);
        this.readers[this.readers.length - 1] = reader;   
    }
    private void addHistory(History histories) {
        this.histories = Arrays.copyOf(this.histories, this.histories.length+1);
        this.histories[this.histories.length - 1] = histories;   
    }
}

