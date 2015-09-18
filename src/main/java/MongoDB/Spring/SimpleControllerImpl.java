package MongoDB.Spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleControllerImpl implements SimpleController {
	
	@Autowired
	private IdentityRepository identityRepository;
	
	@RequestMapping("/test")
	public String test(@RequestParam(defaultValue = "Hui") String name) {
		identityRepository.save(new Identity(name));
		return "saved";
	}

	@Override
	@RequestMapping("/all")
	public List<Identity> allIdentities() {
		return identityRepository.findAll();
	}
	
	
}
