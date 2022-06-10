package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 implements Command{
    private float timeOfEarth;
    private float timeOfRocket;
    private Double Speed;
    @Override
    public void execution(BufferedReader input) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Введите сколько лет пройдет относительно Земли");
                this.timeOfRocket = Float.parseFloat(input.readLine());
                System.out.println("Введите скорость ракеты");
                this.Speed = Double.parseDouble(input.readLine());
                this.timeOfEarth = (float) (timeOfRocket /(Math.sqrt(1 - Math.pow(Speed,2))));
                System.out.println("Ответ:" + timeOfEarth);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число или пустсую строку");
            }
        }
    }

    @Override
    public String getName() {
        return "1";
    }

    @Override
    public String getDescription() {
        return "Какое время пройдет на Земле, если в ракете, движущейся со скоростью V относительно Земли, пройдет T лет?";
    }
}
