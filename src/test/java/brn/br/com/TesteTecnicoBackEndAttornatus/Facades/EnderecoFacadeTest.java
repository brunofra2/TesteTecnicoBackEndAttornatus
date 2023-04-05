package brn.br.com.TesteTecnicoBackEndAttornatus.Facades;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.EnderecoFacade;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.impl.EnderecoFacadeImpl;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.EnderecoService;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.impl.EnderecoServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do facade - endereco")
public class EnderecoFacadeTest {

    @Mock
    private EnderecoServiceImpl enderecoService;

    @InjectMocks
    private EnderecoFacadeImpl enderecoFacade;

    @Test
    @DisplayName("resources - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<Endereco> data = List.of(criartransacaoModel());
        Mockito.when(enderecoService.findAll()).thenReturn(data);
        enderecoFacade.findAll();
        Mockito.verify(enderecoService).findAll();
    }

    @Test
    @DisplayName("resources - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(enderecoService.findById(id)).thenReturn(criartransacaoModel());
        enderecoFacade.findById(id);
        Mockito.verify(enderecoService).findById(id);
    }
    @Test
    @DisplayName("Resources - criar pessoa")
    public void criarPessoa(){
        Mockito.when(enderecoService.create(criartransacaoDto())).thenReturn(criartransacaoDto());
        enderecoFacade.create(criartransacaoDto());
        Mockito.verify(enderecoService).create(criartransacaoDto());
    }

    @Test
    @DisplayName("Resources - alterar pessoa")
    public void alterarPessoa(){
        Mockito.when(enderecoService.update(criartransacaoDto())).thenReturn(criartransacaoDto());
        enderecoFacade.update(criartransacaoDto());
        Mockito.verify(enderecoService).update(criartransacaoDto());
    }

    private EnderecoDto criartransacaoDto() {
        EnderecoDto end = new EnderecoDto(1,"rua sinamomo","8425000","67","figueira");
        return  end;
    }

    private Endereco criartransacaoModel() {
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        return  end;
    }
}
