package guru.springframwrork.springrestclientexamples.services;

import guru.springframwrork.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
    @Autowired
    ApiService apiService;

    @Before
    public void setUp() {
    }

    @Test
    public void TestGetUsers() throws Exception{
        List<User> users = apiService.getUsers(3);
        assertEquals(4, users.size());

    }
}