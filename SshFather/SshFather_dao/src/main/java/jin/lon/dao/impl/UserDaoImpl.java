package jin.lon.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import jin.lon.bean.User;
import jin.lon.dao.UserDao;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:19:01 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
    
    @Override
    public User findById(Integer id) {
        
        return getHibernateTemplate().get(User.class, id); 
    }

}
  
