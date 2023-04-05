package brn.br.com.TesteTecnicoBackEndAttornatus.facade;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;

import java.util.List;

public interface EnderecoFacade {

    List<EnderecoDto> findAll();
    EnderecoDto findById(Integer id);
    EnderecoDto create(EnderecoDto endereco);
    EnderecoDto update(EnderecoDto end);
    void delete(Integer id);
}
