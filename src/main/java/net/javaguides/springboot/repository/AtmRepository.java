package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Atm;

@Repository
public interface AtmRepository extends JpaRepository<Atm, Long> {

}
