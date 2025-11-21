/*
        program: Read a text file and print its contents
 */

import java.io.*;
import java.nio.file.*;

class Notepad
{
   public static void main(String A[]) throws IOException
   {
        Path p = Paths.get("input.txt");
        Files.lines(p).forEach(System.out::println);
   }    
}