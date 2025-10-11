package JavaCoding.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileIntro {
    public static void main(String[] args) {
        // CreateNewFile();
        writeFile();

    }

    private static void writeFile() {
      
          try {
               String loc = "C:\\Users\\vijitha\\Desktop\\Java\\JavaCoding\\Files\\file.txt";
             File f1 = new File(loc);
            //  Scanner read=new Scanner("f1");
            //  while(read.hasNextLine()){
            //     String data=read.nextLine();
            //     System.out.println(data);
            //  }
            //  read.close();
            FileWriter fw=new FileWriter(f1);
            fw.write("I am Writing the Some of the Files ");
            System.out.println("Successfully wrote the file");
            fw.close();
          } catch (Exception e) {
            e.printStackTrace();
          }

      
      
    }

    static void CreateNewFile() {
        try {
            String loc = "C:\\Users\\vijitha\\Desktop\\Java\\JavaCoding\\Files\\file.txt";
            File f1 = new File("loc");
            if (f1.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("Getting some error can check once??");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
