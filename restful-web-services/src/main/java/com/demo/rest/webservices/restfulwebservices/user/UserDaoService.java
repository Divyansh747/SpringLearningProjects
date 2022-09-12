package com.demo.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<Users> users = new ArrayList<>();
	private static int userCount = 0;
	static {
		users.add(new Users(userCount++, "Adam", LocalDate.now().minusYears(30)));
		users.add(new Users(userCount++, "Eve", LocalDate.now().minusYears(25)));
		users.add(new Users(userCount++, "Jim", LocalDate.now().minusYears(20)));
	}

	public List<Users> findAll() {
		return users;
	}

	public Users save(Users user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

	public Users findById(int id) {
		Predicate<? super Users> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		Predicate<? super Users> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}

}
