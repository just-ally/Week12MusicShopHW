import ShopItems.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item guitar;
    Item trumpet;
    Item guitarString;
    Item drumSticks;

    @Before
    public void before() {
        shop = new Shop("Mel's Music");
        guitar = new Guitar(100,250,"Fender", "green", FamilyType.STRING, 6);
        trumpet = new Trumpet(200, 350, "Mendini", "brass", FamilyType.WOODWIND, "alto");
        guitarString = new GuitarString(2, 3);
        drumSticks = new DrumSticks(4, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Mel's Music", shop.getName());
    }

    @Test
    public void startsWith0Stock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(drumSticks);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.removeStock(guitar);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addStock(drumSticks);
        shop.addStock(drumSticks);
        shop.addStock(guitarString);
        shop.addStock(guitarString);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        assertEquals(606, shop.calculatePotentialProfit());
    }
}
