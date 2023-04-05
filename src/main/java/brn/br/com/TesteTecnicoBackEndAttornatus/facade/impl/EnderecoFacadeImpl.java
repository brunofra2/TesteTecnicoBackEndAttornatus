package brn.br.com.TesteTecnicoBackEndAttornatus.facade.impl;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Repositories.EnderecoRepository;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.EnderecoFacade;
import brn.br.com.TesteTecnicoBackEndAttornatus.mapper.EnderecoMapper;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EnderecoFacadeImpl implements EnderecoFacade {
    @Autowired
    private EnderecoService enderecoService;

    @Override
    public List<EnderecoDto> findAll() {
        return EnderecoMapper.convertListModelToDto(enderecoService.findAll());
    }

    public EnderecoDto findById(Integer id){
        return  EnderecoMapper.convertModelToDto(enderecoService.findById(id));
    }

    @Override
    public EnderecoDto create(EnderecoDto endereco) {
        return enderecoService.create(endereco);
    }

    @Override
    public EnderecoDto update(EnderecoDto end) {
        return enderecoService.update(end);
    }

    @Override

    public void delete(Integer id) {
        enderecoService.delete(id);
    }
}
