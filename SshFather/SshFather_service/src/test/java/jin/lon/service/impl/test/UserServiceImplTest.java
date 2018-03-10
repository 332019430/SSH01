package jin.lon.service.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jin.lon.bean.User;
import jin.lon.service.UserService;

/**  
 * ClassName:UserServiceImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午11:10:08 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/application*.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void testFindById() {
        User user = userService.findById(1);
        System.out.println(user.getName());
    }

}
  
