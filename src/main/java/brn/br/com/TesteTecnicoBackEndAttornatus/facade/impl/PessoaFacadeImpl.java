package brn.br.com.TesteTecnicoBackEndAttornatus.facade.impl;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.PessoaFacade;
import brn.br.com.TesteTecnicoBackEndAttornatus.mapper.PessoaMapper;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PessoaFacadeImpl implements PessoaFacade {

    @Autowired
    private PessoaService pessoaService;
    @Override
    public List<PessoaDto> findAll() {
        return PessoaMapper.convertListModelToDto(pessoaService.findAll());
    }

    @Override
    public PessoaDto findById(Integer id) {
        return PessoaMapper.convertModelToDto(pessoaService.findById(id));
    }

    @Override
    public PessoaDto create(PessoaDto pessoa) {
        return pessoaService.create(pessoa);
    }

    @Override
    public PessoaDto update(PessoaDto pessoa) {
        return pessoaService.update(pessoa);
    }

    @Override
    public void delete(Integer id) {
        pessoaService.delete(id);
    }
}
