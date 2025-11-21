/*
        Program : Merge Two Binary Files
        Algorithm:
        Open the first file in FileInputStream
        Open the second file in FileInputStream
        Create a FileOutputStream for the merged file
        Copy bytes from both input files into the output file one after the other
*/
import java.io.*;
import java.util.*;

public class MergeFile
 {
    public static void main(String[] args)
     {
        String file1 = "File1.txt";
        String file2 = "File2.txt";
        String MergeFile = "MergeFile.txt";

       
        try
        (FileInputStream File1 = new FileInputStream(file1);
        FileInputStream File2 = new FileInputStream(file2);
        FileOutputStream merge = new FileOutputStream(MergeFile))
        {
            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = File1.read(Buffer)) != -1)
            {
                merge.write(Buffer,0,iRet);
            }
            while((iRet = File2.read(Buffer)) != -1)
            {
                merge.write(Buffer,0,iRet);
            }

            System.out.println("File merge successfully:");
        }
        catch(IOException ex)
        {

        }
        
    }
}