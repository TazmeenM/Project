import java.util.*;
import java.io.*;

class User{
    private String username = "";
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private BufferedReader fileReader; 
    private BufferedWriter writer;
    public User(String name) throws IOException{
        //Declaring and initializing variables
        /*
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader; 
        BufferedWriter writer;
        */
        String fileName = "";
        int bookIndex = 0;
        String addBook = "yes";
        String bookName = "";
        String book = "";
        int bookNumber = 0;
        String line = "";

        username = name;
        fileName = username + ".txt";
        writer = new BufferedWriter(new FileWriter(fileName));
        fileReader = new BufferedReader(new FileReader(fileName));
        System.out.println("Would you like to add a book?");
        addBook = input.readLine();
        while (addBook.equalsIgnoreCase("yes")){
            addBook(fileName);
            /*
            bookName = input.readLine();
            writer.append(bookName + "\n");
            */
            System.out.println("Would you like to add a book?");
            addBook = input.readLine();
        }
        while (line != null){
            line = fileReader.readLine();
            if (line != null){
                System.out.println(line);
            }
        }
        String username = name;

        System.out.print("Enter the book you would like to find: ");
        book = input.readLine();
        bookNumber = hasRead(fileName, book);
        
        if (bookNumber >= 1){
            System.out.println(bookNumber);
        }
        else{
            System.out.println("You have not entered this book.");
        }
    }

    public int hasRead(String fileName, String name) throws IOException{
        String bookName = "";
        int counter = 0;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while ((bookName = fileReader.readLine()) != null){
            System.out.println(bookName);
            
            if (bookName.equalsIgnoreCase(name)){
                return (counter + 1);
            }
            else{
                counter++;
            }
        }
        fileReader.close();
        return (-1);
    }

    public void addBook(String fileName) throws IOException{
        writer = new BufferedWriter(new FileWriter(fileName));
        String bookName = input.readLine();
        writer.append(bookName + "\n");
        writer.close();
    }
}