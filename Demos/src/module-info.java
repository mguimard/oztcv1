/**
 * 
 */
/**
 * 
 */

import com.mycompany.user.IUserService;

module Demos {
	requires java.sql;
	
	requires IUserInterfaceModule;
	
	requires UserServiceImplA;
	requires UserServiceImplB;
	
	uses IUserService;
}