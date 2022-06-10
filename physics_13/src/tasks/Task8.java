package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 implements Command{
    private float p;
    private float E;
    private float m = (float) (1.6 * Math.pow(10, -27));
    @Override
    public void execution(BufferedReader input) throws IOException {

        input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Введите количество энергии");
                this.E = Float.parseFloat(input.readLine());
                this.p = (float) ((float) Math.sqrt( E*(E + 2 *m * 9 * Math.pow(10, 16)))/ (3 * Math.pow(10, 8)));
                System.out.println("Ответ:" + p);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число или пустсую строку");
            }
        }
    }

    @Override
    public String getName() {
        return "8";
    }

    @Override
    public String getDescription() {
        return "Найти зависимость импульса частицы с массой m от ее кинетической энергии. " +
                "Вычислить импульс протона с кинетической энергией E";
    }
}
