package iw.atu.week8;

import java.io.* ;

public class week8 {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile2.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
                try
                {
                    FileWriter myWriter = new FileWriter(myFile, true);
                    myWriter.write("how are you?");
                    myWriter.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
        }

    }
}
