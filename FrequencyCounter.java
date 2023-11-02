import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/** ***************************************************
 *  Name:           Aarya
 *  Class:          CS30S
 * 
 *  Assignment:     Frequency Counter
 * 
 *************************************************************/

public class FrequencyCounter {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        // a new line character that works on every computer system
        final String nl = System.lineSeparator();

        final int MAX = 1000;        //biggest size of array

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        //create array
        int [] list = new int [MAX];
        
        int i = 0;

        // ***** objects *****
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("listOfNumbers.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Aarya" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Frequency Counter" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****
        // ***** Main Processing *****

        //prime loop
        strin = fin.readLine();

        while(strin != null){
            list[i] = Integer.parseInt(strin);
            System.out.println(list[i]);

            //update loop control
            strin = fin.readLine();
        }
    

        // System.out.println("_____________________");
        // System.out.println(list);

        // ***** Print Formatted Output *****
        // ***** Closing Message *****
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
