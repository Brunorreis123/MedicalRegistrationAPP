package consultorio.germano.api.pacientes;

import consultorio.germano.api.enderecos.DadosEderecos;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf,
                                    DadosEderecos endereco) {
}
