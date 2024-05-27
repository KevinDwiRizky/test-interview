package kevin.com.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReverseTest {
    public String reverseKata(String input) {
        if (input == null) {
            return null;
        }

        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }

    @Test
    void testReverseString() {
        assertEquals("god", reverseKata("dog"));
    }
}
