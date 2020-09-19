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

    @Test
    void should_return_itself_when_input_string_is_the_vowels_number_more_than_30per_but_not_have_continuous_set_of_vowels() {
        //Given
        Mommifier mommifier =new Mommifier();
        String string_is_the_vowels_number_more_than_30per_but_not_have_continuous_set_of_vowels="return";
        //When
        String result = mommifier.convert(string_is_the_vowels_number_more_than_30per_but_not_have_continuous_set_of_vowels);
        //Then
        assertEquals(string_is_the_vowels_number_more_than_30per_but_not_have_continuous_set_of_vowels,result);
    }

    @Test
    void should_return_insert_once_mommy_when_input_string_is_the_vowels_number_more_than_30per_and_have_continuous_set_of_vowels() {
        //Given
        Mommifier mommifier =new Mommifier();
        String string_is_the_vowels_number_more_than_30per_and_have_continuous_set_of_vowels ="keep";
        //When
        String result = mommifier.convert(string_is_the_vowels_number_more_than_30per_and_have_continuous_set_of_vowels);
        //Then
        assertEquals("kemommyep",result);
    }

    @Test
    void should_return_insert_multiple_times_mommy_when_input_string_is_the_vowels_number_more_than_30per_and_have_many_continuous_set_of_vowels() {
        //Given
        Mommifier mommifier =new Mommifier();
        String string_is_the_vowels_number_more_than_30per_and_have_many_continuous_set_of_vowels="eeeee";
        //When
        String result = mommifier.convert(string_is_the_vowels_number_more_than_30per_and_have_many_continuous_set_of_vowels);
        //Then
        assertEquals("emommyemommyemommyemommye",result);
    }
}