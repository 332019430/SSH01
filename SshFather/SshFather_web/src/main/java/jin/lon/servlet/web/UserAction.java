package jin.lon.servlet.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jin.lon.bean.User;
import jin.lon.service.UserService;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:21:57 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.6  
     */
    private static final long serialVersionUID = 1L;
    private User model;
    
    

    @Override
    public User getModel() {
        if (model==null) {
            model=new User();
        }  
        return model;
    }
    
    private UserService userService;
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String findById(){
        model = userService.findById(model.getId());
        return SUCCESS;
    }
    
}
  
