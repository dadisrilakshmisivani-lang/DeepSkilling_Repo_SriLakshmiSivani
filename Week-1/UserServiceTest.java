import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testFetchUserName() {

        // Create Mock
        UserRepository mockRepo = mock(UserRepository.class);

        // Stubbing
        when(mockRepo.getUserName(1)).thenReturn("Sivani");

        // Inject Mock
        UserService service = new UserService(mockRepo);

        // Test
        String result = service.fetchUserName(1);

        assertEquals("Sivani", result);
    }
}