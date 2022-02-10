package guru.springframwrork.springrestclientexamples.services;

import guru.springframwrork.api.domain.User;
import guru.springframwrork.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;


    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData= restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?limit"+limit,UserData.class);
        return userData.getData();
    }
}
