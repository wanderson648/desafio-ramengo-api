package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.infra;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinSpringDataRepository extends JpaRepository<Protein, Integer> {
}
