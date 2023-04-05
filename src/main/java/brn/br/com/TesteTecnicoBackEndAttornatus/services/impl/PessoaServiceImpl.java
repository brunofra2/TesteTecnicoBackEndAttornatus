package brn.br.com.TesteTecnicoBackEndAttornatus.services.impl;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Repositories.PessoaRepository;
import brn.br.com.TesteTecnicoBackEndAttornatus.exceptions.RequiredObjectIsNullException;
import brn.br.com.TesteTecnicoBackEndAttornatus.mapper.PessoaMapper;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private PessoaRepository pessoaRepository;
    @Override
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa findById(Integer id) {
        return pessoaRepository.findById(id).get();
    }

    @Override
    public PessoaDto create(PessoaDto pes) {

        if (pes == null) throw new RequiredObjectIsNullException();

        var entity = PessoaMapper.convertDtoToModel(pes);
        var vo =  PessoaMapper.convertModelToDto(pessoaRepository.save(entity));
        return vo;
    }

    @Override
    public PessoaDto update(PessoaDto pes) {
        if (pes == null) throw new RequiredObjectIsNullException();
        var entity = PessoaMapper.convertDtoToModel(pes);
        var vo =  PessoaMapper.convertModelToDto(pessoaRepository.save(entity));
        return vo;
    }

    @Override
    public void delete(Integer id) {
        pessoaRepository.delete(pessoaRepository.findById(id).get());
    }


}
