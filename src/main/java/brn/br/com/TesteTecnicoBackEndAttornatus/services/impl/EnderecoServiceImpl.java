package brn.br.com.TesteTecnicoBackEndAttornatus.services.impl;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Repositories.EnderecoRepository;
import brn.br.com.TesteTecnicoBackEndAttornatus.exceptions.RequiredObjectIsNullException;
import brn.br.com.TesteTecnicoBackEndAttornatus.mapper.EnderecoMapper;
import brn.br.com.TesteTecnicoBackEndAttornatus.mapper.PessoaMapper;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Override
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco findById(Integer id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public EnderecoDto create(EnderecoDto endereco) {
        if (endereco == null) throw new RequiredObjectIsNullException();

        var entity = EnderecoMapper.convertDtoToModel(endereco);
        var vo =  EnderecoMapper.convertModelToDto(enderecoRepository.save(entity));
        return vo;
    }

    @Override
    public EnderecoDto update(EnderecoDto end) {
        if (end == null) throw new RequiredObjectIsNullException();
        var entity = EnderecoMapper.convertDtoToModel(end);
        var vo =  EnderecoMapper.convertModelToDto(enderecoRepository.save(entity));
        return vo;
    }

    @Override
    public void delete(Integer id) {
        enderecoRepository.delete(enderecoRepository.findById(id).get());
    }


}
