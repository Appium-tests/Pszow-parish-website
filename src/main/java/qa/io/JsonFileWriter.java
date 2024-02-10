package qa.io;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {

    private static final String fileName = "PP_Phrases";
    private static final String filePath = "./src/test/resources/testdata/";

    public static void save() {

        String source = MockarooTestDataLoader.fetch(fileName);
        System.out.println(source);

        try {
            FileWriter writer = new FileWriter(filePath + fileName + ".json");
            writer.write(source);
            writer.close();
            System.out.println("WRITE!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
