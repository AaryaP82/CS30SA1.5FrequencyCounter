import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Aarya
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5
 * 
 *************************************************************/

public class FrequencyCounter {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        // a new line character that works on every computer system
        final String nl = System.lineSeparator();
        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        int[] list = new int[1000];

        // ***** objects *****
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        Random random = new Random();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Aarya" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5 Frequency Counter" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****
        
        // ***** Main Processing *****
        
        //load list of random numbers
        
        System.out.println("loading the list with random number");
        
         for(int i = 0; i < list.length; i++){
             list[i] = random.nextInt(50) + 1;
             System.out.println(list[i]);
         }//end load list
         

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
