package dasha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashFunctionTwoTest {
        HashMap2 dash2;

        @Before
        public void init() {
            dash2 = new HashMap2();
            dash2.set("Temmie", 1);
            dash2.set("Tem", 2);
            dash2.set("Tommy", 3);
            dash2.set("Bob", 20);

        }


        @Test
        public void setTest2() {
            Integer actual = dash2.get("Tem");
            Integer expected = 2;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void setTest1() {
            Integer actual = dash2.get("Bob");
            Integer expected = 20;
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void deleteTest() {
            dash2.delete("Tommy");
            Assert.assertEquals(null, dash2.get("Tommy"));
        }

        @Test
        public void isEmptyTest() {
            dash2.delete("Tem");
            dash2.delete("Bob");
            dash2.delete("Temmie");
            dash2.delete("Tommy");
            Assert.assertTrue(dash2.isEmpty());
        }

        @Test
        public void sizeTest() {
            Integer expected = 4;
            Assert.assertEquals(expected, dash2.size);
        }

        @Test
        public void bucketSizeTest() {

            Integer expected = 2;
            Assert.assertEquals(expected, dash2.bucketSize("Tommy"));
        }
    }
