package library.managementoflibrary.service;


import library.managementoflibrary.model.User;
import library.managementoflibrary.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
