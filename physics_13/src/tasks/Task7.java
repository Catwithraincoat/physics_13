package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 implements Command{
    private float E;
    private float R;
    private float m;
    private float W;
    @Override
    public void execution(BufferedReader input) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Введите количество энергии");
                this.E = Float.parseFloat(input.readLine());
                System.out.println("Введите радиус");
                this.R = Float.parseFloat(input.readLine());
                this.W = (float) (E * 4 * Math.PI* Math.pow(R, 2));
                this.m = (float) (W/ (9 *Math.pow(10, 16)));
                System.out.println("Ответ:" + m);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число или пустсую строку");
            }
        }
    }

    @Override
    public String getName() {
        return "7";
    }

    @Override
    public String getDescription() {
        return "На единицу площади верхней граничной поверхности земной атмосферы, расположенной перпендикулярно к солнечным лучам," +
                " солнечное излучение приносит в единицу времени E Дж энергии. Определите энергию, излучаемую солнцем в единицу времени и массу," +
                " теряемую Солнцем в единицу времени.";
    }
}
