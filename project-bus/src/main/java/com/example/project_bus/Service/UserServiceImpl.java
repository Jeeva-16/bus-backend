package com.example.project_bus.Service;

import com.example.project_bus.Model.Bus;
import com.example.project_bus.Model.Ticket;
import com.example.project_bus.Model.User;
import com.example.project_bus.Repository.BusRepository;
import com.example.project_bus.Repository.TicketRepository;
import com.example.project_bus.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
@Autowired
    private UserRepository userRepository;
@Autowired
private BusRepository busRepository;
@Autowired
private TicketRepository ticketRepository;
 @Override
    public void saveUser(User user) {
       userRepository.save(user);
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Bus getBusById(Long id) {
        Optional<Bus> optional = busRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }else{
            throw new RuntimeException("Bus not found "+id);
        }
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

}
