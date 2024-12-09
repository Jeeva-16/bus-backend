package com.example.project_bus.Service;

import com.example.project_bus.Model.Bus;
import com.example.project_bus.Model.Ticket;
import com.example.project_bus.Model.User;

import java.util.List;

public interface UserService {
 void saveUser(User user);
List<Bus>getAllBuses();
Bus getBusById(Long id);
void saveTicket(Ticket ticket);

}
