package br.com.tebd.atena.entity;

public class VinculoParticipanteInstituicao {
	
	private Integer id;
	private Instituicao instituicao;
	private VinculoInstitucional vinculo;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	public VinculoInstitucional getVinculo() {
		return vinculo;
	}
	public void setVinculo(VinculoInstitucional vinculo) {
		this.vinculo = vinculo;
	}

}
