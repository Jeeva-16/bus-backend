package com.example.project_bus;

import com.example.project_bus.Model.Bus;
import com.example.project_bus.Model.User;
import com.example.project_bus.Repository.BusRepository;

import com.example.project_bus.Repository.UserRepository;
import com.example.project_bus.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.client.ExpectedCount.times;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @Test
    void testSaveUser_Success(){
        User user = new User(1L,"jeeva","jeeva@gmail.com","jeeva123");
        when(userRepository.save(any(User.class))).thenReturn(user);

        // Act
        User savedUser = userService.saveUser(user);
        assertNotNull(savedUser);
        assertEquals("jeeva", savedUser.getName());
        assertEquals("jeeva@gmail.com", savedUser.getEmail());
        verify(userRepository, times(1)).save(user);
    }


}
