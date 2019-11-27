package dasha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashamapTest {
Dashamap dash;
   @Before
    public void init(){
       dash = new Dashamap();
       dash.set("Cookie", 1);
       dash.set("Pancake",2);
       dash.set("Ice cream", 3);
       dash.set("Cake", 20);
   }


    @Test
    public void setTest2(){
        Integer actual = dash.get("Cookie");
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest1(){
        Integer actual = dash.get("Ice cream");
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setTest3(){
        Integer actual = dash.get("Cake");
        Integer expected = 20;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){
       dash.delete("Ice cream");
       Assert.assertEquals(null, dash.get("Ice cream"));
    }

    @Test
    public void isEmptyTest(){
       dash.delete("Ice cream");
       dash.delete("Cookie");
       Assert.assertFalse(dash.isEmpty());
    }
    @Test
    public void sizeTest(){
       Integer expected = 4;
       Assert.assertEquals(expected, dash.size);
    }
    @Test
    public void bucketSizeTest(){
       dash.set("Bread", 40);
       dash.set("Bon Bons", 20);
       dash.set("Biscuits",10);
       dash.set("Bignets", 1);
       dash.set("Buns" , 7);
       Integer expected = 5;
       Assert.assertEquals(expected, dash.bucketSize("B"));
    }
}