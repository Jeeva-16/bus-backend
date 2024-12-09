package com.example.project_bus.Repository;

import com.example.project_bus.Model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus,Long> {

}
