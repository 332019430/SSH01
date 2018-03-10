package jin.lon.dao;

import jin.lon.bean.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:18:38 <br/>       
 */
public interface UserDao {

    User findById(Integer id);

}
  
