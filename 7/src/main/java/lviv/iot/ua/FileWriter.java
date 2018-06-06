package lviv.iot.ua;

import java.io.*;
import java.util.List;

public class FileWriter {
    public void writeCSV(List<HistoricalMovie> parts)
            throws IOException {
        try (
                Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("file.csv"), "utf-8"))) {

            for (HistoricalMovie historicalMovie : parts) {

                writer.write(historicalMovie.getHeaders());
                writer.write(historicalMovie.toCSV());

            }
        } catch (IOException e) {
        }
    }
}
