package brn.br.com.TesteTecnicoBackEndAttornatus.Resources;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.PessoaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/TesteTecnico/pessoa/")
public class PessoaResource {

    @Autowired
    private PessoaFacade pessoaFacade;

    @GetMapping("/all")
    public List<PessoaDto> getLista(){
        return pessoaFacade.findAll();
    }

    @GetMapping("/{id}")
    public PessoaDto findById(@PathVariable Integer id){
        return pessoaFacade.findById(id);
    }
    @PostMapping("/create")
    public PessoaDto create(@RequestBody PessoaDto pes){

        return pessoaFacade.create(pes);
    }

    @PutMapping("/update")
    public PessoaDto update(@RequestBody PessoaDto pes){
        return  pessoaFacade.update(pes);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        pessoaFacade.delete(id);
    }





}
