package brn.br.com.TesteTecnicoBackEndAttornatus.facade;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;

import java.util.List;

public interface PessoaFacade {

    List<PessoaDto> findAll();

    PessoaDto findById(Integer id);

    PessoaDto create(PessoaDto pessoa);
    PessoaDto update(PessoaDto pessoa);

    void delete(Integer id);
}
