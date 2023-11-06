package sptech.school.jogos.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.jogos.dto.jogo.JogoResponseDto;
import sptech.school.jogos.dto.jogo.mapper.JogoMapper;
import sptech.school.jogos.entity.Jogo;
import sptech.school.jogos.service.JogoService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/jogos")
public class JogoController {

    private final JogoService service;


    @GetMapping
    public ResponseEntity<List<JogoResponseDto>> listar(){
        List<Jogo> jogos = service.listar();

        List<JogoResponseDto> jogosDto = jogos.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }


    @GetMapping("/{id}")
    public ResponseEntity<List<JogoResponseDto>> listarPorId(@PathVariable Integer id){
        Optional<Jogo> jogo = service.listarPorId(id);

        if(jogo.isEmpty())
            return ResponseEntity.noContent().build();

        List<JogoResponseDto> jogosDto = jogo.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }

    @GetMapping("/nome")
    public ResponseEntity<List<JogoResponseDto>> listarPorNome(String nome){
        List<Jogo> jogos = service.listarPorNome(nome);

        if(jogos.isEmpty())
            return ResponseEntity.noContent().build();

        List<JogoResponseDto> jogosDto = jogos.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }

    @GetMapping("/genero")
    public ResponseEntity<List<JogoResponseDto>> listarPorGenero(String genero){
        List<Jogo> jogos = service.listarPorGenero(genero);

        if(jogos.isEmpty())
            return ResponseEntity.noContent().build();

        List<JogoResponseDto> jogosDto = jogos.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }

    @GetMapping("/plataforma")
    public ResponseEntity<List<JogoResponseDto>> listarPorPlataforma(String plataforma){
        List<Jogo> jogos = service.listarPorPlataforma(plataforma);

        if(jogos.isEmpty())
            return ResponseEntity.noContent().build();

        List<JogoResponseDto> jogosDto = jogos.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }

    @GetMapping("/classificacao")
    public ResponseEntity<List<JogoResponseDto>> listarPorClassificacao(String classificacao){
        List<Jogo> jogos = service.listarPorClassificacao(classificacao);

        if(jogos.isEmpty())
            return ResponseEntity.noContent().build();

        List<JogoResponseDto> jogosDto = jogos.stream()
                .map(JogoMapper::toJogoEmpresaDto)
                .toList();

        return ResponseEntity.ok(jogosDto);
    }

    @PostMapping
    public ResponseEntity<JogoResponseDto> cadastrar(@RequestBody Jogo jogo){
        Jogo jogoSalvo = service.cadastrar(jogo);

        JogoResponseDto jogoDto = JogoMapper.toJogoEmpresaDto(jogoSalvo);

        return ResponseEntity.ok(jogoDto);
    }

    @PutMapping
    public ResponseEntity<JogoResponseDto> atualizar(@RequestBody Jogo jogo){
        Jogo jogoSalvo = service.atualizar(jogo);

        JogoResponseDto jogoDto = JogoMapper.toJogoEmpresaDto(jogoSalvo);

        return ResponseEntity.ok(jogoDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Integer id){
        service.remover(id);

        return ResponseEntity.noContent().build();
    }
}
