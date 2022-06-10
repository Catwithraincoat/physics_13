package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Mem implements Command{
    @Override
    public void execution(BufferedReader input) throws IOException {
        System.out.println("Для всех уставших программистов: друг перешел из ядерной физики в программирование и радуется,\n" +
                " как все легко: просто берешь нужную библиотеку, и пишешь код, гуглишь проблемы. В\n" +
                "ядерной физике нужную тебе штуку построят через 20 лет‚ а по проблеме гуглится только одна статья, твоя");
    }

    @Override
    public String getName() {
        return "мем";
    }

    @Override
    public String getDescription() {
        return "воть";
    }
}
