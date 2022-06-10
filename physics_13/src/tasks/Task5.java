package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 implements Command{
    private float n;
    private float v;
    @Override
    public void execution(BufferedReader input) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Введите долю");
                if( n > 1){throw new NumberFormatException();}
                this.n = Float.parseFloat(input.readLine());
                this.v = (float) Math.sqrt(1 - Math.pow(1- n, 2));
                System.out.println("Ответ:" + v+ "c");

                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, число большее 1 или пустсую строку");
            }
        }
    }

    @Override
    public String getName() {
        return "5";
    }

    @Override
    public String getDescription() {
        return "Стержень движется в продольном направлении с постоянной скоростью v относительно инерциальной K-системы отсчета. " +
                "При каком значении v длина стержня в этой системе отсчета будет на η  меньше его собственной длины?";
    }
}
