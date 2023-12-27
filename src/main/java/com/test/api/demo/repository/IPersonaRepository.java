package com.test.api.demo.repository;

import com.test.api.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
