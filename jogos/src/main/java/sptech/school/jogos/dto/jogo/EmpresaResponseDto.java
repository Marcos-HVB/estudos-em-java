package sptech.school.jogos.dto.jogo;


import lombok.Data;

import java.util.UUID;

@Data
public class EmpresaResponseDto {


    private Integer id;

    private String nome;

    private String cnpj;

    private String endereco;
}
