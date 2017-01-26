package HomeWork11.HomeWork11_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class GreatAndWriteFile {

    public static void greatFile(String fileName, String fileType, String fileContent) {
        try{
            File fileForWrite = new File(fileName+fileType);
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(fileForWrite));
            buffWriter.write(fileContent);
            buffWriter.close();
            System.out.println("File great!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
