import org.junit.Test;
import static org.mockito.Mockito.*;

public class UserServiceVerifyTest {

    @Test
    public void testRegisterUser() {

        // Create Mock
        UserRepository mockRepo = mock(UserRepository.class);

        // Create Service
        UserService service = new UserService(mockRepo);

        // Call Method
        service.registerUser("Sivani");

        // Verify Interaction
        verify(mockRepo).saveUser("Sivani");
    }
}