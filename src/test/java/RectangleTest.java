import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    public void testRectangleInsideRectangle() {
        Rectangle outerRectangle = new Rectangle(4, 8, 16, 2);
        Rectangle innerRectangle = new Rectangle(6, 6, 12, 4);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleOutsideRectangle() {
        Rectangle outerRectangle = new Rectangle(4, 8, 6, 6);
        Rectangle innerRectangle = new Rectangle(12, 16, 20, 10);
        assertFalse(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleSimilar() {
        Rectangle outerRectangle = new Rectangle(4, 8, 16, 2);
        Rectangle innerRectangle = new Rectangle(4, 8, 16, 2);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleOverlap() {
        Rectangle outerRectangle = new Rectangle(4, 8, 16, 2);
        Rectangle innerRectangle = new Rectangle(6, 6, 20, 4);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }
}