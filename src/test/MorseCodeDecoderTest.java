package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeDecoderTest {

    @Test
    void oneWordTest() {
        String morseCode = ". .";
        String[] words = morseCode.split("   ");
        assertEquals(words.length, 1);
    }
}