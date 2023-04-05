package brn.br.com.TesteTecnicoBackEndAttornatus.services;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;

import java.util.List;

public interface PessoaService {

    List<Pessoa> findAll();

    Pessoa findById(Integer id);
    PessoaDto create(PessoaDto pessoa);
    PessoaDto update(PessoaDto pessoa);
    void delete(Integer id);
}
