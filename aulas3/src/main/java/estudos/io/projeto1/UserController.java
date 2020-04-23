package estudos.io.projeto1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//	1) Por que RestController == a requisição será feita como numa API Rest

	@RequestMapping(value = "user/{name}", method = RequestMethod.GET)
	public List<User> getUsers(@PathVariable String name) {

		List<User> users = new ArrayList<>();

		User user = new User("Thiago", "thiago@email.com");
		User user2 = new User(name, "jose@email.com");

		users.add(user);
		users.add(user2);

		return users;
	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public User setUser(@RequestBody User user) {
		return user;
	}
}
