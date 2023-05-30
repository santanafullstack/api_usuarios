package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AutenticarResponseDTO {

	private Integer status;
	private String mensagem;
	private Integer idUsuario;
	private String nome;
	private String email;
	private String accessToken;
}




