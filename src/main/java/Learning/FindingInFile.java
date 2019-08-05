package Learning;

import java.io.*;

public class FindingInFile{

    public static void main(String args[]) {

        try {
            // input file
            FileInputStream fstream = new FileInputStream("src/main/resources/testdata");

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            // output file
            BufferedWriter out = new BufferedWriter(new FileWriter("src/main/resources/testdataout.txt"));

            String strLine;
            Boolean broken = false;
            int line = 0;
            int linecount = 0;
            int paracount = 0;
            int wordCount = 0;


      while ((strLine = br.readLine()) != null) {

          String[] wordList = strLine.split("\\s");
          wordCount = wordList.length;

        System.out.println("wordCount : "+wordCount);
        if (strLine.contains("Shantanu")) { // keyword
          broken = true;
        }
        if (broken) {
          out.write(strLine);
          out.newLine();
          line++;
        }
        if (line == 5) { // print next 10 lines after exception
          broken = false;
          line = 0;
        }
      }

            in.close();
            out.close();


            System.out.println("Successfully written to file");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
