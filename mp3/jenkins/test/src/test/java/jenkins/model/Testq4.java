package jenkins.model;
import static org.junit.Assert.*;
import org.junit.Test;

public class Testq4 {
    public void testOne(){
        String filename = "asldkfj$0041";
        IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
        assertEquals(test.idFromFilename(filename), "asldkfjA")
    }
    public void testTwo(){
        String filename = "asldkfj$0042";
        IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
        assertEquals(test.idFromFilename(filename), "asldkfjB")
    }
}