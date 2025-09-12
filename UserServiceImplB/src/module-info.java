/**
 * 
 */
/**
 * 
 */

import com.mycompany.user.IUserService;
import com.mycompany.user.User;
import io.java.world.UserServiceB;

module UserServiceImplB {
	requires IUserInterfaceModule;
	provides IUserService with UserServiceB;
}