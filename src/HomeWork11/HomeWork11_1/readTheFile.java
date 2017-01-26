package HomeWork11.HomeWork11_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class readTheFile {
    public static Map<String, String> replacer(String filename, String fileType){
        Map<String, String> map = new TreeMap<>();
        try (BufferedReader fileRead = new BufferedReader( new FileReader(filename+fileType))){
            String stringBefore = fileRead.readLine();
            map.put("fileForHM_1BeforeReplace", stringBefore);
            String stringAfter = stringBefore.replaceAll("to", "ME");
            map.put("fileForHM_1AfterReplace", stringAfter);
            System.out.println();
            fileRead.close();
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        }
        return map;
    }
}