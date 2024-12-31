package dev.rama27.app.testing.testbasics.jupiter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class ExampleJ5UnitTest {
     @BeforeAll
     public static void setUpClass() {
         log.info("Set Up Class");
     }
     @BeforeEach
     public void seUp(){
         log.info("Set Up");
     }
     @AfterEach
     public void tearDown(){
         log.info("Tear Down");
     }
     @AfterAll
     public static void tearDownClass(){
         log.info("Tear Down Class");
     }

     @Test
     public void two_plus_two(){
         log.info("2+2=4");
         assertEquals(4,2+2);
         Exception ex=assertThrows(IllegalArgumentException.class,()->{
             throw new IllegalArgumentException("Expected exception");
         });
         assertTrue(ex.getMessage().contains("Expected exception"));
     }
     @Test
     public void one_and_one(){
         log.info("1+1=2");
         assertTrue(1+1==2,"problem with addition");
         assertEquals( 2,1+1,()->String.format("problem with %d+%d",1,1));
     }
}
