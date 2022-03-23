package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends JpaRepository<Car, Integer> {
}
