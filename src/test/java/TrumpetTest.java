import ShopItems.FamilyType;
import ShopItems.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(200, 350, "Mendini", "brass", FamilyType.WOODWIND, "alto");
    }

    @Test
    public void hasType() {
        assertEquals("alto", trumpet.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Trumpet sounds like tooting", trumpet.play("tooting"));
    }
}
