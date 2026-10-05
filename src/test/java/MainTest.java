import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void printsTheExampleFromTheReadme() {
        PrintStream original = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured, true, StandardCharsets.UTF_8));
        try {
            Main.main(new String[0]);
        } finally {
            System.setOut(original);
        }
        String expected = String.join(System.lineSeparator(),
                "Bienvenue",
                "Le résultat de 2 * 3 = 6",
                "2 - 3 = -1",
                "2 + 3 = 5",
                "Au revoir",
                "2 / 3 = 0.6666666666666666",
                "Au revoir",
                "Bonsoir") + System.lineSeparator();
        assertEquals(expected, captured.toString(StandardCharsets.UTF_8));
    }
}
