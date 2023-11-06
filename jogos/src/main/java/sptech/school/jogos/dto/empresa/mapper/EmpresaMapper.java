package sptech.school.jogos.dto.empresa.mapper;

import sptech.school.jogos.dto.empresa.EmpresaResponseDto;
import sptech.school.jogos.dto.empresa.JogoResponseDto;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.entity.Jogo;

import java.util.List;

public class EmpresaMapper {

    public static EmpresaResponseDto toEmpresaJogoDto(Empresa empresaEntidade) {

        if (empresaEntidade == null) {
            return null;
        }

        EmpresaResponseDto empresaResponseDto = new EmpresaResponseDto();

        empresaResponseDto.setId(empresaEntidade.getId());
        empresaResponseDto.setNome(empresaEntidade.getNome());
        empresaResponseDto.setCnpj(empresaEntidade.getCnpj());
        empresaResponseDto.setEndereco(empresaEntidade.getEndereco());

        if (!empresaEntidade.getJogos().isEmpty()){

            List<Jogo> jogos = empresaEntidade.getJogos();

            // STREAM API
            List<JogoResponseDto> consultasDtos = jogos.stream()
                    .map(EmpresaMapper::toJogoDto)
                    .toList();

            empresaResponseDto.setJogos(consultasDtos);
        }

        return empresaResponseDto;
    }


    public static JogoResponseDto toJogoDto(Jogo jogoEntidade) {

        if (jogoEntidade == null) return null;

        JogoResponseDto consultaJogoDto = new JogoResponseDto();

        consultaJogoDto.setId(jogoEntidade.getId());
        consultaJogoDto.setNome(jogoEntidade.getNome());
        consultaJogoDto.setGenero(jogoEntidade.getGenero());
        consultaJogoDto.setPlataforma(jogoEntidade.getPlataforma());
        consultaJogoDto.setClassificacao(jogoEntidade.getClassificacao());

        return consultaJogoDto;
    }


}
