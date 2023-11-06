package sptech.school.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.entity.Jogo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {


    Optional<Jogo> findById(Integer id);

    List<Jogo> findByNomeContainingIgnoreCase(String nome);

    List<Jogo> findByGeneroContainingIgnoreCase(String genero);

    List<Jogo> findByPlataformaContainingIgnoreCase(String plataforma);

    List<Jogo> findByClassificacaoContainingIgnoreCase(String classificacao);
}
