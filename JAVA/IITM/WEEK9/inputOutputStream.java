import java.io.*;
import java.util.Scanner;



public class inputOutputStream {
    public static void main(String[] args) {
// To READ a file
    /* 
        try {
            var fin = new FileInputStream("data.txt");
            var scin = new Scanner(fin);
            while (scin.hasNext()==true) {
                String line = scin.next();
                System.out.println(line);
            }
            scin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    */
// To WRITE in a file
    /* 
        // create file input.txt
        // append mode = false (default) (will overwrite)
        // var fout = new FileOutputStream("c:\\root\\output.txt");
        // append mode = true
        try{
            var fout = new FileOutputStream( "output.txt", false);
            var pout =new PrintWriter(fout);
            // pout var= new PrintWriter(new FileOutputStream("output.txt"));
            String msg = "this is output file";
            pout.println(msg);
            pout.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    */
    
// COPY infile.txt -> outfile.txt
    /* 
        try {
            var in = new Scanner(new FileInputStream("infile.txt"));
            var out = new PrintWriter(new FileOutputStream("outfile.txt"));
            while (in.hasNext()) {
                String line = in.nextLine();
                out.println(line);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    */

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}