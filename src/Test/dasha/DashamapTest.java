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

}