package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 implements Command{
    private float t;
    private float P;
    private float m;
    @Override
    public void execution(BufferedReader input) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Введите время в секундах");
                this.t = Float.parseFloat(input.readLine());
                System.out.println("Введите мощность");
                this.P = Float.parseFloat(input.readLine());
                this.m = (float) (P*t/ (3* Math.pow(10,8)));
                System.out.println("Ответ:" + m);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число или пустсую строку");
            }
        }
    }

    @Override
    public String getName() {
        return "6";
    }

    @Override
    public String getDescription() {
        return "Какому изменению массы соответствует энергия, вырабатываемая за t электростанцией мощностью P МВт?";
    }
}
