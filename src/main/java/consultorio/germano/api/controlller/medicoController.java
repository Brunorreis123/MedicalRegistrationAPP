package consultorio.germano.api.controlller;

import consultorio.germano.api.medico.DadosCadastroMedico;
import consultorio.germano.api.pacientes.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class medicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
    System.out.println(dados);
    }

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dados){
        System.out.println();
    }

}
