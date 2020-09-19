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

    @Test
    void should_return_empty_string_when_input_is_empty_string() {
        //Given
        Mommifier mommifier = new Mommifier();
        String empty_string = "";
        //When
        String result = mommifier.convert(empty_string);
        //Then
        assertEquals(empty_string, result);
    }

    @Test
    void should_return_itself_when_input_string_is_the_vowels_number_less_than_30per() {
        //Given
        Mommifier mommifier =new Mommifier();
        String the_vowels_number_less_than_30per_of_string="string";
        //When
        String result = mommifier.convert(the_vowels_number_less_than_30per_of_string);
        //Then
        assertEquals(the_vowels_number_less_than_30per_of_string,result);
    }
}