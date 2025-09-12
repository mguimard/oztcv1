package ozt.jpms;

import java.lang.annotation.Annotation;
import java.util.Optional;
import java.util.ServiceLoader;

import com.mycompany.user.Environment;
import com.mycompany.user.IUserService;

public class ServiceLoaderExample {

	public static void main(String[] args) {		
		ServiceLoader<IUserService> implementations = ServiceLoader.load(IUserService.class);
		
		implementations.stream().map(i -> i.get()).forEach((s) -> {
			System.out.println(s.getClass());
			Environment a  = s.getClass().getAnnotation(Environment.class);			
			System.out.println(a.value());			
			if(a.value().equals("dev")) {
				System.out.println(s.loadUsers());
			}
		});
		/*
		implementations.forEach(service -> {
			System.out.println(s.getClass());
			Environment a  = s.getClass().getAnnotation(Environment.class);			
			System.out.println(a.value());			
			System.out.println(service.loadUsers());
		});
		
		s.
		*/
	}
	
	public static void main2(String[] args) {
		
		// new ImplA, new ImplB
		ServiceLoader<IUserService> s = ServiceLoader.load(IUserService.class);
		
		Optional<IUserService> o = s.findFirst();
		
		if(o.isPresent()) {
			IUserService service = o.get();			
			System.out.println(service.loadUsers()); // ??
		}
		
	}

}
