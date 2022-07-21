package au.com.sportsbet.depthchart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class TestHelper {
    public static String loadTestCase(String jsonFile) throws IOException {
        InputStream is = TestHelper.class.getClassLoader().getResourceAsStream(jsonFile);
        if (is == null) {
            throw new IllegalArgumentException(jsonFile + " is not found");
        }
        try (InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr);) {
            return br.lines().collect(Collectors.joining("\n"));
        } finally {
            is.close();
        }
    }

}
