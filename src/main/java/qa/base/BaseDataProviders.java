package qa.base;

import lombok.Getter;
import qa.testdataloader.TestDataLoader;

public class BaseDataProviders {

    @Getter
    private static String source;

    public static void loadTestData(String filename) {

        source = TestDataLoader.fetch(filename);
    }
}
