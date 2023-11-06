package sptech.school.jogos.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.jogos.dto.empresa.EmpresaResponseDto;
import sptech.school.jogos.dto.empresa.mapper.EmpresaMapper;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.service.EmpresaService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaService service;


    @GetMapping
    public ResponseEntity<List<EmpresaResponseDto>> listar(){

        List<Empresa> all = service.listar();

        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EmpresaResponseDto> empresaDtos = all.stream()
                .map(EmpresaMapper::toEmpresaJogoDto)
                .toList();;

        return ResponseEntity.ok(empresaDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<EmpresaResponseDto>> listarPorId(@PathVariable Integer id){

        Optional<Empresa> all = service.listarPorId(id);

        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EmpresaResponseDto> empresaDtos = all.stream()
                .map(EmpresaMapper::toEmpresaJogoDto)
                .toList();;

        return ResponseEntity.ok(empresaDtos);
    }

    @GetMapping("/nome")
    public ResponseEntity<List<EmpresaResponseDto>> listarPorNome(@RequestParam String nome){

        List<Empresa> all = service.listarPorNome(nome);

        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EmpresaResponseDto> empresaDtos = all.stream()
                .map(EmpresaMapper::toEmpresaJogoDto)
                .toList();;

        return ResponseEntity.ok(empresaDtos);
    }

    @GetMapping("/cnpj")
    public ResponseEntity<List<EmpresaResponseDto>> listarPorCnpj(@RequestParam String cnpj){

        List<Empresa> all = service.listarPorCnpj(cnpj);

        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EmpresaResponseDto> empresaDtos = all.stream()
                .map(EmpresaMapper::toEmpresaJogoDto)
                .toList();;

        return ResponseEntity.ok(empresaDtos);
    }


    @GetMapping("/endereco")
    public ResponseEntity<List<EmpresaResponseDto>> listarPorEndereco(@RequestParam String endereco){

        List<Empresa> all = service.listarPorEndereco(endereco);

        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<EmpresaResponseDto> empresaDtos = all.stream()
                .map(EmpresaMapper::toEmpresaJogoDto)
                .toList();;

        return ResponseEntity.ok(empresaDtos);
    }

    @GetMapping("/totalJogos")
    public ResponseEntity<Integer> contarTotalJogos(){

        Integer totalJogos = service.contarTotalJogos();

        return ResponseEntity.ok(totalJogos);
    }

    @PostMapping
    public ResponseEntity<EmpresaResponseDto> cadastrar(@RequestBody Empresa empresa){

        Empresa empresaSalva = service.cadastrar(empresa);

        EmpresaResponseDto empresaDto = EmpresaMapper.toEmpresaJogoDto(empresaSalva);

        return ResponseEntity.ok(empresaDto);
    }

    @PutMapping
    public ResponseEntity<EmpresaResponseDto> atualizar(@RequestBody Empresa empresa){

        Empresa empresaSalva = service.atualizar(empresa);

        EmpresaResponseDto empresaDto = EmpresaMapper.toEmpresaJogoDto(empresaSalva);

        return ResponseEntity.ok(empresaDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Integer id){

        service.remover(id);

        return ResponseEntity.noContent().build();
    }

}
