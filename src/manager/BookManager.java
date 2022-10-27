/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Author;
import entity.Book;
import java.util.Scanner;

 public class BookManager {
    private final Scanner scanner;
    
     public BookManager(){
     scanner = new Scanner(System.in);
     }
    public Book createBookWithAuthors(){
        System.out.println("Введите название книги");
        String bookName = scanner.nextLine();
        System.out.print("Введите год издания книги: ");
        String publishedYear = scanner.nextLine();
        System.out.print("Введите количество экземпляров книги");
        String quantity = scanner.nextLine();

        Book book = createBook(bookName, new Integer(quantity), Integer.parseInt(publishedYear));
        System.out.println("Введите кол-во авторов книги: ");
        int countAuthorInBook = scanner.nextInt(); scanner.nextLine();
        for (int i = 0; i < countAuthorInBook; i++) {
            System.out.println("Введите имя автора"+(i+1)+": ");
            String firstname = scanner.nextLine();
            System.out.println("Введите фамилию автора"+(i+1)+": ");
            String lastname = scanner.nextLine();
            System.out.println("Введите год рождения"+(i+1)+": ");
            String birthday = scanner.nextLine();
            book.addAuthor(createAuthor(firstname, lastname, new Integer(birthday)));
        }
        return book;
    }
    
    public void printListBooks(Book books[]){
        System.out.println("6. Список книг");
        for (int i = 0; i < books.length; i++) {
            System.out.print(i+1+". "+books[i].getBookName()+". ");
            for (int j = 0; j < books[i].getAuthors().length; j++) {
                System.out.printf("%s %s %d", 
                books[i].getAuthors()[j].getFirstname(),
                books[i].getAuthors()[j].getLastname(),
                books[i].getAuthors()[j].getBirthday());
            }
        }    
    }
    public Book createBook(String bookName, int quantity, int publishedYear){
        Book book = new Book();
        book.setBookName(bookName);
        book.setPublishedYear(publishedYear);
        book.setQuantity(quantity);
        return book;
    }
    public Author createAuthor(String firstname, String lastname, int birthday){
        Author author = new Author();
        author.setBirthday(birthday);
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    public Book[] changeBook(Book[] books){
        System.out.println("Список книг:");
        //for (int = 0; i < books.length; i++){
            //System.out.print(i+1+". "+books[i].getBookName()+". ");
            //for 
    //}
        return books;
    }
 }