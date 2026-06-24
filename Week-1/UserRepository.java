public interface UserRepository {

    String getUserName(int id);

    void saveUser(String name);
}