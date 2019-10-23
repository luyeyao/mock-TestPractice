package jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;

public class jacksonTester {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

//        当反序列化json时，未知属性会引起的反序列化被打断，这里我们禁用未知属性打断反序列化功能，
//        因为，例如json里有10个属性，而我们的bean中只定义了2个属性，其它8个属性将被忽略
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        //从json映射到java对象，得到country对象后就可以遍历查找,下面遍历部分内容，能说明问题就可以了
        TestJson testJson = mapper.readValue("{\"a\":\"1\",\"b\":\"2\",\"c\":\"test\",\"d\":\"true\",\"e\":\"e\"}", TestJson.class);
        System.out.println("a:" + testJson.getA());
        System.out.println("b:" + testJson.getB());
        System.out.println("c:" + testJson.getC());
        System.out.println("d:" + testJson.getD());
    }

}