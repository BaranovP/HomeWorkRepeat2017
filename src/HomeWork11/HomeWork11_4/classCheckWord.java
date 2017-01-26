package HomeWork11.HomeWork11_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static HomeWork11.HomeWork11_1.varFor.FILE_NAME_FOR_HM11_1;
import static HomeWork11.HomeWork11_1.varFor.FILE_TYPE_FOR_HM1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class classCheckWord {
    public static int checkWordWithTry_with_resources(String world) {
        int count = 0;
        int b = 0;
        String worlds, sub;
        String worldForCheck = " " + world + " ";
        try (BufferedReader fileRead = new BufferedReader(new FileReader(FILE_NAME_FOR_HM11_1 + FILE_TYPE_FOR_HM1))) {
            worlds = fileRead.readLine();
            for (int i = 0; i < worlds.length(); i++) {
                sub = worlds.substring(b, i);
                if (sub.contains(worldForCheck)) {
                    b = i;
                    count++;
                }
            }
            System.out.println("File conteins the world: " + world + " " + count + " times");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int checkWordWithUsualTry(String world) {
        int count = 0;
        int b = 0;
        String worlds, sub;
        String worldForCheck = " " + world + " ";
        FileReader in = null;
        BufferedReader fileRead = null;
        try {
            fileRead = new BufferedReader(new FileReader(FILE_NAME_FOR_HM11_1 + FILE_TYPE_FOR_HM1));
            worlds = fileRead.readLine();
            for (int i = 0; i < worlds.length(); i++) {
                sub = worlds.substring(b, i);
                if (sub.contains(worldForCheck)) {
                    b = i;
                    count++;
                }
            }
            fileRead.close();
            System.out.println("File conteins the world: " + world + " " + count + " times");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileRead != null) {
                try {
                    fileRead.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return count;
        }
    }
}