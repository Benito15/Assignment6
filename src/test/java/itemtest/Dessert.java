package itemtest;

import ac.za.cput.factories.itemfactory.DessertFactory;
import org.junit.Assert;
import org.junit.Test;

public class Dessert {

    @Test
    public void dessertTest()
    {
        String desc = "Jelly";

        int qty = 3;
        double price = 250;

        ac.za.cput.domains.item.Dessert dessert = DessertFactory.getDessert(desc,qty,price);
        System.out.println(dessert);
        Assert.assertNotNull(dessert.getQty());

    }
}
