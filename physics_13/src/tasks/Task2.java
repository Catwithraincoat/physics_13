package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 implements Command{
    private float timeOfEarth;
    private float timeOfМizon;
    private Double Lenght;
    @Override
    public void execution(BufferedReader input) throws IOException {
        System.out.println("Из-за того, что задача правдоподобная не вижу смысла изменять переменные , поэтому вот решение");
        this.timeOfEarth = (float) (6 * Math.pow(10,3) / 0.995*Math.pow(10,8));
        System.out.println("Время жизни мю-мезона для наблюдателя на Земле" + timeOfEarth);
        this.timeOfМizon = (float) (6 * Math.pow(10,3) * Math.sqrt(1 - Math.pow(0.995,2)));
        System.out.println("Собственное время жизни Мизона" + timeOfМizon);
        this.Lenght =  timeOfМizon/ (0.995 * 3 * Math.pow(10,8) );
        System.out.println("Собственная длина пути, пройденного мю-мезоном");
    }

    @Override
    public String getName() {
        return "2";
    }

    @Override
    public String getDescription() {
        return "Частицы космического излучения мю-мезоны рождаются в верхних слоях атмосферы. При скорости 0,995С они успевают пролететь до своего распада расстояние 6,0*103м." +
                " Определите время жизни мю-мезона для наблюдателя на Земле, собственное время его жизни, собственную длину пути, пройденного мю-мезоном.";
    }
}
