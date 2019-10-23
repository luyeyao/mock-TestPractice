import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class mockTest {

    @Category({SlowTests.class})
    @Test
    public void test1(){
        assertTrue(false);
    }

    @Category({FastTests.class})
    @Test
    public void test2(){
        assertTrue(true);
    }


}
