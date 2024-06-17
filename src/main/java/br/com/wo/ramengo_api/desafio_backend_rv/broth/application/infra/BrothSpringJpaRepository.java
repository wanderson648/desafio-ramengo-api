package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.infra;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrothSpringJpaRepository extends JpaRepository<Broth, Integer> {
}
