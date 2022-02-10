package guru.springframwrork.springrestclientexamples.services;

import guru.springframwrork.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
