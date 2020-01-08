import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RopeTests {

    @Test
    public void null_throws() {
        String input = null;
        try {
            var rope = new Rope(input);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void length_of_newly_created_rope() {
        String input = "Testing";
        var rope = new Rope(input);
        Assertions.assertEquals(input.length(), rope.length());
    }
}
