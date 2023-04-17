package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testRectangle(){
        Rectangle rec = new Rectangle(5,10);

        assertEquals(5,rec.getLength());
        assertEquals(10,rec.getWidth());
        assertEquals(50,rec.getArea());
        assertEquals(30,rec.getPerimeter());
    }
}
