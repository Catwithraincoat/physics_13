import tasks.CommandsKeeper;
import tasks.*;
import exceptions.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] strCommands  = {"1", "2", "3", "5", "6", "7", "8", "мем","выход"};
        System.out.println("Здравствуйте, Елена Константиновна, для того чтобы воспользоваться программой просто вводите\n"+
                "номер задания которое хотите проверить. К сожалению, мне не хватило ума решить 4 задачу, поэтому ее здесь нет,\n"+
                "однако есть команда \"мем\", которая поднимет вам настроение :)\n"+
                "для выхода из программы введите \"выход\"\n");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        CommandsKeeper commandsKeeper = new CommandsKeeper(new Task1(), new Task2(), new Task3(), new Task5(), new Task6(),
                new Task7(),new Task8(), new Exit(), new Mem());
        while (true){
            System.out.println("Ждем ввод)");
            while (true) {
                try {
                    String newCom = input.readLine();
                    if ((Arrays.asList(strCommands).contains(newCom))) {
                        commandsKeeper.execute(newCom, input);
                    } else {
                        throw new WrongArgsException();
                    }
                    break;
                } catch (WrongArgsException e) {
                    System.out.println("Неправильно введена комманда");
                }
            }



        }

    }
}
