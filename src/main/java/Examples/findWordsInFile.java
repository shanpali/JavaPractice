package Examples;

import java.io.*;

public class findWordsInFile {

    static String s = "my name is shantanu";
    int count = 0;

    public int wordsInFile(String file){

        try (FileInputStream ir = new FileInputStream(file)) {
            int str = ir.read();
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return count;
    }


    public static void main(String[] args) throws IOException {

        findWordsInFile fl = new findWordsInFile();
        FileWriter fw = new FileWriter("./src/main/resources/testdata");
        fw.write(s);
        fw.close();

       int result = fl.wordsInFile("./src/main/resources/testdata");

        System.out.println(result);


    }

}
