import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger();
        try {
            logger.log();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("kekw");
        
    }
}
