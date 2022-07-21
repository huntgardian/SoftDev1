import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {

    @Test
    public void testStringCount() throws IOException {
        //setup path of readable .txt file
        Path filePath = Path.of("D:/SSC/SoftDev/Module8/macbeth.txt");

        //create the string to be read through and eliminate any potential parsing issues from the code
        String txtContent = Files.readString(filePath).replace("\n", "").replaceAll("\\p{Punct}","");

        //create the array of strings from the text
        String stringArray[] = txtContent.split(" ");

        assertEquals(14854, stringArray.length);
    }

}
