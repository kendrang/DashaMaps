package dasha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashFunctionThreetest {
    HashMap3 dash3;

    @Before

    public void init() {
        dash3 = new HashMap3();
        dash3.set("Temmie", 1);
        dash3.set("Tem", 2);
        dash3.set("Tommy", 3);
        dash3.set("Tob", 20);

    }


    @Test
    public void setTest2() {
        Integer actual = dash3.get("Tem");
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest1() {
        Integer actual = dash3.get("Tob");
        Integer expected = 20;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void deleteTest() {
        dash3.delete("Tommy");
        Assert.assertEquals(null, dash3.get("Tommy"));
    }

    @Test
    public void isEmptyTest() {
        dash3.delete("Tem");
        dash3.delete("Tob");
        dash3.delete("Temmie");
        dash3.delete("Tommy");
        Assert.assertTrue(dash3.isEmpty());
    }

    @Test
    public void sizeTest() {
        Integer expected = 4;
        Assert.assertEquals(expected, dash3.size);
    }

    @Test
    public void bucketSizeTest() {
        Integer expected = 2;
        Assert.assertEquals(expected, dash3.bucketSize("Tommy"));
    }
}
