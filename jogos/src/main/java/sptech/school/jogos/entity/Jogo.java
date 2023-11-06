package sptech.school.jogos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "O nome do jogo é obrigatório")
    private String nome;

    @NotBlank(message = "O gênero do jogo é obrigatório")
    private String genero;

    @NotBlank(message = "A plataforma do jogo é obrigatório")
    private String plataforma;

    @NotBlank(message = "A classificação do jogo é obrigatório")
    @Max(value = 18, message = "A classificação deve ser menor ou igual a 18 anos")
    private String classificacao;

    @ManyToOne
    private Empresa empresa;

}
