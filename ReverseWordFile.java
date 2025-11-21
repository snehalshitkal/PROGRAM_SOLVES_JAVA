import java.io.*;
import java.util.*;

public class ReverseWordFile
 {
    public static void main(String[] args)
     {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        List<String> lines = new ArrayList<>();

        // Step 1: Read all lines from the input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                lines.add(line);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

        // Step 2: Reverse the list
        Collections.reverse(lines);

        // Step 3: Write reversed lines to output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) 
        {
            for (String line : lines) 
            {
                bw.write(line);
                bw.newLine();  // write newline
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Lines reversed successfully!");
    }
}