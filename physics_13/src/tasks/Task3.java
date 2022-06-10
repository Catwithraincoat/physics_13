package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Task3 implements Command{
    @Override
    public void execution(BufferedReader input) throws IOException {
        System.out.println("Из-за того, что задача правдоподобная не вижу смысла изменять переменные , поэтому решение в прикрепленных файлах");

    }

    @Override
    public String getName() {
        return "3";
    }

    @Override
    public String getDescription() {
        return "Найти длину стержня в движущейся системе координат, скорость V которой направлена под углом α к покоящемуся стержню длины l0";
    }
}
