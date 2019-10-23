import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)//将类改掉，runwith
//@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses({
        DemoTest.class,
        mockTest.class

})
public class SuiteTest {

}
