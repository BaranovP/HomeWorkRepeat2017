package HomeWork11.HomeWork11_4;

import HomeWork11.HomeWork11_1.GreatAndWriteFile;

import static HomeWork11.HomeWork11_1.varFor.FILE_NAME_FOR_HM11_1;
import static HomeWork11.HomeWork11_1.varFor.FILE_TYPE_FOR_HM1;
import static HomeWork11.HomeWork11_1.varFor.TEXT_FOR_HM1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args) {
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        classCheckWord  classCheckWord  = new classCheckWord ();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_1, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        classCheckWord.checkWordWithTry_with_resources("with");
        classCheckWord.checkWordWithUsualTry("to");
    }
}
