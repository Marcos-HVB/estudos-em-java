package sptech.school.jogos.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.repository.EmpresaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    /* cadastrar
    lista
    buscarPorId
    remover
    atualizar
     */

    private final EmpresaRepository repository;


    public List<Empresa> listar(){
        return repository.findAll();
    }

    public Optional<Empresa> listarPorId(Integer id){
        return repository.findById(id);
    }


    public Empresa cadastrar(Empresa empresa){

        return repository.save(empresa);
    }

    public Empresa atualizar(Empresa empresa){
        return repository.save(empresa);
    }


    public void remover(Integer id){
        repository.deleteById(id);
    }

    public List<Empresa> listarPorNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Empresa> listarPorCnpj(String cnpj){
        return repository.findByCnpjContainingIgnoreCase(cnpj);
    }

    public List<Empresa> listarPorEndereco(String endereco){
        return repository.findByEnderecoContainingIgnoreCase(endereco);
    }

    public Integer contarTotalJogos(){
        return repository.contarTotalJogos();
    }


}
