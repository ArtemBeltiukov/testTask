import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static File logFile;
    {
        logFile = new File("/log.txt");
    }
    public void log() throws IOException {
        File dir = new File("C:/");
        File[] listFiles = dir.listFiles();
        FileWriter writer = new FileWriter(logFile.getPath(), true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        StringBuilder sb = new StringBuilder();
        for (File file:listFiles
        ) {
            sb.append(file.getName()).append("\n");
        }
        bufferWriter.write(sb.toString());
        bufferWriter.close();
    }
}
