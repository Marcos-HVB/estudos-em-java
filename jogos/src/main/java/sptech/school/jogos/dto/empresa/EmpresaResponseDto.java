package sptech.school.jogos.dto.empresa;


import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class EmpresaResponseDto {

    private Integer id;

    private String nome;

    private String cnpj;

    private String endereco;

    private List<JogoResponseDto> jogos;
}
