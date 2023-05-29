package consultorio.germano.api.medico;

import consultorio.germano.api.enderecos.DadosEderecos;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  DadosEderecos endereco) {

}
