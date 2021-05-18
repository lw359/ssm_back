import com.guigu.mapper.testUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;
//让测试运行于Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//应用配置文件
@ContextConfiguration({"classpath:beans.xml"})
public class test {
    @Autowired(required = false)
   private testUserMapper testUserMapper;
    @Test
    public void sss() throws SQLException {
        List<testUserPojo> testUserPojos = testUserMapper.selectList(null);
        System.out.println(testUserPojos);
    }
}
