package sptech.school.jogos.dto.jogo;


import lombok.Data;

import java.util.UUID;

@Data
public class JogoResponseDto {

    private Integer id;

    private String nome;

    private String genero;

    private String plataforma;

    private String classificacao;

    private EmpresaResponseDto empresa;
}

