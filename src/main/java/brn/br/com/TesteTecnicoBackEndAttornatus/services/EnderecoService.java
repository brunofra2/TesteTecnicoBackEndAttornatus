package brn.br.com.TesteTecnicoBackEndAttornatus.services;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;

import java.util.List;

public interface EnderecoService {

    List<Endereco> findAll();
    Endereco findById(Integer id);

    EnderecoDto create(EnderecoDto endereco);

    EnderecoDto update(EnderecoDto end);

    void delete(Integer id);

}
