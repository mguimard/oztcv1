/**
 * 
 */
/**
 * 
 */

import com.coucou.java.UserServiceA;
import com.mycompany.user.IUserService;

module UserServiceImplA {
	requires IUserInterfaceModule;
	provides IUserService with UserServiceA;
}