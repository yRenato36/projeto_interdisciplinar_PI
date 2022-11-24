package com.sos2.SOS2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sos2.SOS2.entidade.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
