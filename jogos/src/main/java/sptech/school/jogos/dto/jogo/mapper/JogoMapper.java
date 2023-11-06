package sptech.school.jogos.dto.jogo.mapper;

import sptech.school.jogos.dto.jogo.EmpresaResponseDto;
import sptech.school.jogos.dto.jogo.JogoResponseDto;
import sptech.school.jogos.entity.Empresa;
import sptech.school.jogos.entity.Jogo;

import java.util.Objects;


public class JogoMapper {


        public static JogoResponseDto toJogoEmpresaDto(Jogo jogoEntidade) {

            if (jogoEntidade == null) {
                return null;
            }

            JogoResponseDto jogoResponseDto = new JogoResponseDto();

            jogoResponseDto.setId(jogoEntidade.getId());
            jogoResponseDto.setNome(jogoEntidade.getNome());
            jogoResponseDto.setGenero(jogoEntidade.getGenero());
            jogoResponseDto.setPlataforma(jogoEntidade.getPlataforma());
            jogoResponseDto.setClassificacao(jogoEntidade.getClassificacao());

            if (Objects.nonNull(jogoEntidade.getEmpresa())){


                EmpresaResponseDto consultaDto = toEmpresaDto(jogoEntidade.getEmpresa());

                jogoResponseDto.setEmpresa(consultaDto);
            }

            return jogoResponseDto;
        }


        public static EmpresaResponseDto toEmpresaDto(Empresa empresaEntidade) {

            if (empresaEntidade == null) return null;

            EmpresaResponseDto consultaEmpresaDto = new EmpresaResponseDto();

            consultaEmpresaDto.setId(empresaEntidade.getId());
            consultaEmpresaDto.setNome(empresaEntidade.getNome());
            consultaEmpresaDto.setEndereco(empresaEntidade.getCnpj());
            consultaEmpresaDto.setCnpj(empresaEntidade.getEndereco());

            return consultaEmpresaDto;
        }


    }


