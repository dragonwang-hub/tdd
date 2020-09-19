import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_null_when_input_string_is_null() {
        //Given
        Mommifier mommifier = new Mommifier();
        //When
        String result = mommifier.convert(null);
        //Then
        assertEquals(null, result);
    }
}
