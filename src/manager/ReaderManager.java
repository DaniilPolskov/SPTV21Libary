/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReaderManager {
    public Scanner scanner;
    private Reader[] readers;
    
    public ReaderManager(){
        scanner = new Scanner(System.in);
    }
    public Reader createReader(){
        Reader reader = new Reader();
        System.out.println("Введите имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.println("Введите номер читателя: ");
        reader.setPhone(scanner.nextLine());
        Reader[] newReader = new Reader[this.readers.length +1];
        newReader[newReader.length-1] = reader;
        this.readers = newReader;
        return reader;
    }
    public void printListReaders(Reader[] readers){
        for (int i = 0; i < readers.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n" 
                    ,i+1
                    ,readers[i].getFirstname()
                    ,readers[i].getLastname() 
                    ,readers[i].getPhone());
        }
    }

}
