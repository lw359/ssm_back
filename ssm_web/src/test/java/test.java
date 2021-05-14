import com.guigu.mapper.DingdanXqMapper;
import com.guigu.pojo.DdXq;
import com.guigu.service.gys.DdXqService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
//让测试运行于Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//应用配置文件
@ContextConfiguration({"classpath:beans.xml"})
public class test {
//    @Autowired(required = false)
//   private testUserMapper testUserMapper;
    @Autowired
    private DdXqService ddXqService;

    @Test
    public void sss() throws SQLException {
//        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        DingdanXqMapper bean = classPathXmlApplicationContext.getBean(DingdanXqMapper.class);
//        int updatezt = bean.updatezt(2);
//        System.out.println(updatezt);
        DdXq ddXq = new DdXq();
        ddXq.setOid(2);
        int xiugaizt = ddXqService.xiugaizt(ddXq);
        System.out.println(xiugaizt);
    }

}
