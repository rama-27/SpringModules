package dev.rama27.app.testing.testbasics.vintage;

import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class Example4Test {
    @BeforeClass
    public static void setUpClass() {
        log.info("Set Up Class");
    }
    @Before
    public void seUp(){
        log.info("Set Up");
    }
    @After
    public void tearDown(){
        log.info("Tear Down");
    }
    @AfterClass
    public static void tearDownClass(){
        log.info("Tear Down Class");
    }

    @Test(expected = IllegalArgumentException.class)
    public void two_plus_two(){
        log.info("2+2=4");
        assertEquals(4,2+2);
        throw new IllegalArgumentException("Expected exception");
    }
    @Test
    public void one_and_one(){
        log.info("1+1=2");
        assertTrue("problem with addition",1+1==2);
        assertEquals(String.format("problem with %d+%d",1,1),2,1+1);
    }
}
