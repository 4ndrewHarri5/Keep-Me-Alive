package com.apprentices.KeepMeAlive.repository;

import static org.junit.Assert.assertEquals;

import com.apprentices.KeepMeAlive.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldSaveUser() {
        User user = User.builder()
                .username("jbravo")
                .firstName("Johny")
                .lastName("Bravo")
                .emailAddress("jbravo@gmail.com")
                .active(true)
                .build();
        userRepository.save(user);
        assertEquals(user, userRepository.findByUsername(user.getUsername()));
    }
}