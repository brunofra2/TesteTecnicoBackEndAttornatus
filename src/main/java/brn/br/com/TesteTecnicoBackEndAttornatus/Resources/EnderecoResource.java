package brn.br.com.TesteTecnicoBackEndAttornatus.Resources;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.EnderecoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "/TesteTecnico/endereco/")
public class EnderecoResource {

    @Autowired
    private EnderecoFacade enderecoFacade;

    @GetMapping("/all")
    public List<EnderecoDto> findAll(){
        return enderecoFacade.findAll();
    }

    @GetMapping("/{id}")
    public EnderecoDto findById(@PathVariable Integer id){
        return enderecoFacade.findById(id);
    }

    @PostMapping("/create")
    public EnderecoDto create(@RequestBody EnderecoDto end){
        return enderecoFacade.create(end);
    }

    @PutMapping("/update")
    public EnderecoDto update(@RequestBody EnderecoDto cli){
        return enderecoFacade.update(cli);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        enderecoFacade.delete(id);
    }


}
