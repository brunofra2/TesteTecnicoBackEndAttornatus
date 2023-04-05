package brn.br.com.TesteTecnicoBackEndAttornatus.Repositories;

import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {
}
