package HomeWork11.HomeWork11_3;

import HomeWork11.HomeWork11_1.GreatAndWriteFile;

import static HomeWork11.HomeWork11_1.varFor.FILE_NAME_FOR_HM11_3;
import static HomeWork11.HomeWork11_1.varFor.FILE_TYPE_FOR_HM1;
import static HomeWork11.HomeWork11_1.varFor.TEXT_FOR_HM1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args) {
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        classfileContentMerger classfileContentMerger = new classfileContentMerger();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_3, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        classfileContentMerger.fileContentMerger(FILE_NAME_FOR_HM11_3, FILE_TYPE_FOR_HM1);
    }
}
