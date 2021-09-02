package com.denybarbosa.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denybarbosa.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
