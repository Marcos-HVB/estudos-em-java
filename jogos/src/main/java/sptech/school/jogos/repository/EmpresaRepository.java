package sptech.school.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.school.jogos.entity.Empresa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {


    Optional<Empresa> findById(Integer id);

    List<Empresa> findByNomeContainingIgnoreCase(String nome);

    List<Empresa> findByCnpjContainingIgnoreCase(String cnpj);

    List<Empresa> findByEnderecoContainingIgnoreCase(String endereco);

    @Query("select count(e.jogos) from Empresa e where e.jogos != null")
    Integer contarTotalJogos();

}
