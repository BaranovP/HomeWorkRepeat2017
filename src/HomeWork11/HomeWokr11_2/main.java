package HomeWork11.HomeWokr11_2;

import HomeWork11.HomeWork11_1.GreatAndWriteFile;

import static HomeWork11.HomeWork11_1.varFor.FILE_NAME_FOR_HM11_2;
import static HomeWork11.HomeWork11_1.varFor.FILE_TYPE_FOR_HM1;
import static HomeWork11.HomeWork11_1.varFor.TEXT_FOR_HM1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args) {
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        contentReplacer contentReplacer = new contentReplacer();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_2, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        contentReplacer.fileContentReplacer(FILE_NAME_FOR_HM11_2, FILE_TYPE_FOR_HM1);
    }
}
