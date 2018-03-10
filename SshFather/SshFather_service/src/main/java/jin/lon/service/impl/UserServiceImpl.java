package jin.lon.service.impl;

import org.springframework.transaction.annotation.Transactional;

import jin.lon.bean.User;
import jin.lon.dao.UserDao;
import jin.lon.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:21:21 <br/>       
 */
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    
    public void setUserDao(UserDao userDaoImpl) {
        this.userDao = userDaoImpl;
    }

    @Override
    public User findById(Integer id) {
        
        return userDao.findById(id);
    }

}
  
