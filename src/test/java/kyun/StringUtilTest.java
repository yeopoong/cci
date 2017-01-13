package kyun;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringUtilTest {

	@Test
	public void isUniqueCharTest() {
	    String str = "abcd";
        boolean result = StringUtil.isUniqueChar(str);
        Assert.assertEquals(true, result);

	    str = "abad";
        result = StringUtil.isUniqueChar(str);
        Assert.assertEquals(false, result);
	}
}
