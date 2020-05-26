
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructWeirdSolutionTest(){
        String input = "Hello world
                        I am a file
                        Read me until end-of-file.";
                        
        String expected = "1 Hello world
                        2 I am a file
                        3 Read me until end-of-file.";
                        
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
