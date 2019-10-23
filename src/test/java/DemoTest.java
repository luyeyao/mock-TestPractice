import org.hamcrest.collection.ArrayAsIterableMatcher;
import org.junit.Test;

//import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class DemoTest {
    @Test
    public void demoTest1(){
        assertThat("actual value close to 10",9.89,closeTo(10.0,0.1));
    }

    @Test
    public void demoTest2(){
        assertThat(Math.sqrt(4),is(notANumber()));
    }
    @Test
    public void demoTest3(){
        assertThat(9.98,anyOf(equalTo(9.99),closeTo(10,0.1)));
    }



}
