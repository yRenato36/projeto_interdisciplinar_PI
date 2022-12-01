package com.sos2.SOS2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sos2.SOS2.entidade.Empresa;


@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
