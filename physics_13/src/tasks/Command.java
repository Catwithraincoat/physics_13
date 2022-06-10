package tasks;

import java.io.BufferedReader;
import java.io.IOException;
// интрефейс чтобы было удобнее заполнять задания
public interface Command {

    void execution( BufferedReader input) throws IOException;

    String getName();

    String getDescription();
}
