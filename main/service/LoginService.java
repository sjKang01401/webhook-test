@Service
public class LoginService {

    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String email, String password) {
        System.out.println("Hello  World!");
        return userRepository.findByEmail(email)
            .map(user -> user.getPassword().equals(password))
            .orElse(false);
    }
}
