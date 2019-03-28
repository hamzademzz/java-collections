package Test;


import com.hamza.school.modules.UserModule;
import com.hamza.school.repositories.users.UserFileRepository;
import org.junit.Test;

import java.io.IOException;

public class UserTest {

    @Test
    public void shouldAdd() throws IOException {
        UserFileRepository userFileRepository = null;
        UserModule user = new UserModule(userFileRepository);

        user.add();

        Integer expected =
    }

}
