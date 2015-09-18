package MongoDB.Spring;

import java.util.List;

public interface SimpleController {
	 String test(String name);
	 
	 List<Identity> allIdentities();
}
