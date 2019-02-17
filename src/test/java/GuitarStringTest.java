import ShopItems.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString(2, 3);
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(2, guitarString.getBoughtPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3, guitarString.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1, guitarString.calculateMarkup());
    }
}
