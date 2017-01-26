package HomeWork11.HomeWokr11_2;


import HomeWork11.HomeWork11_1.readTheFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static HomeWork11.HomeWork11_1.varFor.FILE_NAME_FOR_HM11_2;
import static HomeWork11.HomeWork11_1.varFor.FILE_TYPE_FOR_HM1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class contentReplacer {
    public static Map<String, String> fileContentReplacer (String fileName, String fileType) {
        Map<String, String> map;
        readTheFile readTheFile = new readTheFile();
        map = readTheFile.replacer(FILE_NAME_FOR_HM11_2, FILE_TYPE_FOR_HM1);
        try (BufferedWriter fileWriter = new BufferedWriter( new FileWriter(fileName+fileType))){
            fileWriter.write(map.get("fileForHM_1AfterReplace"));
            fileWriter.close();
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        }
        return map;
    }
}