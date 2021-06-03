package com.zensar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
