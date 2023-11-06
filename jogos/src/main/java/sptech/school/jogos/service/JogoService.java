package sptech.school.jogos.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.entity.Jogo;
import sptech.school.jogos.repository.JogoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JogoService {

    /* cadastrar
    lista
    buscarPorId
    remover
    atualizar
     */

    private final JogoRepository repository;

    public List<Jogo> listar(){
        return repository.findAll();
    }

    public Optional<Jogo> listarPorId(Integer id){
        return repository.findById(id);
    }


    public Jogo cadastrar(Jogo empresa){

        return repository.save(empresa);
    }

    public Jogo atualizar(Jogo empresa){
        return repository.save(empresa);
    }


    public void remover(Integer id){
        repository.deleteById(id);
    }

    public List<Jogo> listarPorNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Jogo> listarPorGenero(String genero){
        return repository.findByGeneroContainingIgnoreCase(genero);
    }

    public List<Jogo> listarPorPlataforma(String plataforma){
        return repository.findByPlataformaContainingIgnoreCase(plataforma);
    }

    public List<Jogo> listarPorClassificacao(String classificacao){
        return repository.findByClassificacaoContainingIgnoreCase(classificacao);
    }


}
