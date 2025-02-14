import static org.example.Main.add;
import static org.example.Main.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Calc {

        @Test
        public void testAddTwoNumbers() {
            assertEquals(3, add(1, 2));
            assertEquals(-2, add(-1, -1));
        }

        @Test
        public void testAddMultipleNumbers() {
            assertEquals(15, add(1, 2, 3, 4, 5));
            assertEquals(3, add(1, 2));
            assertEquals(-2, add(-1, -1));
        }


        @Test
        public void testMultiplyTwoNumbers() {
            assertEquals(3, multiply(1, 3));
            assertEquals(-3, multiply(-1, 3));
        }


        @Test
        public void testMultiplyMultipleNumbers() {
            assertEquals(120, multiply(1, 2, 3, 4, 5));
            assertEquals(3, multiply(1, 3));
            assertEquals(-3, multiply(-1, 3));
        }
    }



