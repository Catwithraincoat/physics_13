package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Exit implements Command{
    @Override
    public void execution(BufferedReader input) throws IOException {
        System.out.println("Выход из программы");
        System.exit(0);
    }

    @Override
    public String getName() {return "выход";}

    @Override
    public String getDescription() {return "exit : завершить программу (без сохранения в файл)";}
}
