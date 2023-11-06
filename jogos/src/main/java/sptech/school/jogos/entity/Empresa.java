package sptech.school.jogos.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "O nome da empresa é obrigatório")
    private String nome;

    @NotBlank(message = "O CNPJ da empresa é obrigatório")
    private String cnpj;

    @NotBlank(message = "O endereço da empresa é obrigatório")
    private String endereco;

    @OneToMany(mappedBy = "empresa")
    private List<Jogo> jogos;
}
