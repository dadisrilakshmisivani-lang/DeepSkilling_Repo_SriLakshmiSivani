public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String fetchUserName(int id) {
        return repository.getUserName(id);
    }

    public void registerUser(String name) {
        repository.saveUser(name);
    }
}