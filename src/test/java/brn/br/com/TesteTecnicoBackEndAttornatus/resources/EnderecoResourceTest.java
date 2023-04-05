package brn.br.com.TesteTecnicoBackEndAttornatus.resources;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Resources.EnderecoResource;
import brn.br.com.TesteTecnicoBackEndAttornatus.Resources.PessoaResource;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.EnderecoFacade;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do resource - endereco")
public class EnderecoResourceTest {

    @Mock
    private EnderecoFacade enderecoFacade;
    @InjectMocks
    private EnderecoResource enderecoResource;

    @Test
    @DisplayName("resources - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<EnderecoDto> data = List.of(criartransacao());
        Mockito.when(enderecoFacade.findAll()).thenReturn(data);
        enderecoResource.findAll();
        Mockito.verify(enderecoFacade).findAll();
    }

    @Test
    @DisplayName("resources - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(enderecoFacade.findById(id)).thenReturn(criartransacao());
        enderecoResource.findById(id);
        Mockito.verify(enderecoFacade).findById(id);
    }
    @Test
    @DisplayName("Resources - criar pessoa")
    public void criarPessoa(){
        Mockito.when(enderecoFacade.create(criartransacao())).thenReturn(criartransacao());
        enderecoResource.create(criartransacao());
        Mockito.verify(enderecoFacade).create(criartransacao());
    }

    @Test
    @DisplayName("Resources - alterar pessoa")
    public void alterarPessoa(){
        Mockito.when(enderecoFacade.update(criartransacao())).thenReturn(criartransacao());
        enderecoResource.update(criartransacao());
        Mockito.verify(enderecoFacade).update(criartransacao());
    }

    private EnderecoDto criartransacao() {
        EnderecoDto end = new EnderecoDto(1,"rua sinamomo","8425000","67","figueira");
       return  end;
    }

}
