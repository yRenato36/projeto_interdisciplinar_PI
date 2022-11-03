package model;

/**
 * Classe responsável pela busca os dados de todos os documentos .jsp, ela faz esse meio campo para garantir a segurança dos dados,
 * e transmite para outras classes.
 * @author Renato da Silva Santana e Tiago Faria Gouvêa 3º ADS
 *
 */
public class JavaBeans {
	
	/*TABELA AGENDA*/
	private int id_agenda;
	private String dia_agenda; //verificar se os tipos de dados permitem um ao outro
	private String horario_inicio_agenda; //verificar se os tipos de dados permitem um ao outro
	private String horario_fim_agenda;
	private String servico_agenda;

	/*TABELA BANCO_EMPRESA*/
	private int id_banco_empresa;
	private String banco_empresa;
	private int agencia_empresa;
	private int digito_empresa;
	private String tipo_conta_empresa;
	private String conta_empresa;
	
	/*TABELA COMPROMISSO*/
	private int id_compromisso;
	private String dia_compromisso;
	private String horario_inicio_compromisso;
	private String horario_fim_compromisso;
	
	/*TABELA CONTATO*/
	private int id_contato;
	private String nome_contato;
	private String email_contato;
	private int telefone_contato;
	
	/*TABELA EMPRESA*/
	private int id_empresa;
	private int cnpj_empresa;
	private String razao_social_empresa;
	private String imagem_perfil_empresa;
	private String imagem_empresa;
	private String nome_fantasia_empresa;
	private String sobre_empresa;
	
	/*TABELA ENDERECO_EMPRESA*/
	private int id_endereco_empresa;
	private int cep_empresa;
	private String estado_empresa;
	private String cidade_empresa;
	private String bairro_empresa;
	private int numero_empresa;
	private String endereco_empresa;
	private String complemento_empresa;
	
	/*TABELA FICHA_OBSERVACAO*/
	private int id_ficha_observacao;
	private String observacao;
	
	/*TABELA SERVICO*/
	private int id_servico;
	private String nome_servico;
	private String tipo_servico;
	private String descricao_servico;
	
	/*TABELA USUARIO*/
	private int id_usuario;
	private String nome_usuario;
	private String cpf_usuario;
	private String nascimento_usuario;
	private int telefone_usuario;
	private String email_usuario;
	private String username_usuario;
	private String senha_usuario;
	private int cep_usuario;
	private String endereco_usuario;
	private String estado_usuario;
	private String cidade_usuario;
	private int numero_usuario;
	private String complemento_usuario;
	
	public JavaBeans() {
		super();

	}
	
	public JavaBeans(int id_agenda, String dia_agenda, String horario_inicio_agenda, String horario_fim_agenda,
			String servico_agenda) {
		super();
		this.id_agenda = id_agenda;
		this.dia_agenda = dia_agenda;
		this.horario_inicio_agenda = horario_inicio_agenda;
		this.horario_fim_agenda = horario_fim_agenda;
		this.servico_agenda = servico_agenda;
	}
	
	public JavaBeans(int id_banco_empresa, String banco_empresa, int agencia_empresa, int digito_empresa,
			String tipo_conta_empresa, String conta_empresa) {
		super();
		this.id_banco_empresa = id_banco_empresa;
		this.banco_empresa = banco_empresa;
		this.agencia_empresa = agencia_empresa;
		this.digito_empresa = digito_empresa;
		this.tipo_conta_empresa = tipo_conta_empresa;
		this.conta_empresa = conta_empresa;
	}

	public JavaBeans(int id_compromisso, String dia_compromisso, String horario_inicio_compromisso,
			String horario_fim_compromisso) {
		super();
		this.id_compromisso = id_compromisso;
		this.dia_compromisso = dia_compromisso;
		this.horario_inicio_compromisso = horario_inicio_compromisso;
		this.horario_fim_compromisso = horario_fim_compromisso;
	}

	public JavaBeans(int id_contato, String nome_contato, String email_contato, int telefone_contato) {
		super();
		this.id_contato = id_contato;
		this.nome_contato = nome_contato;
		this.email_contato = email_contato;
		this.telefone_contato = telefone_contato;
	}

	public JavaBeans(int id_empresa, int cnpj_empresa, String razao_social_empresa, String imagem_perfil_empresa,
			String imagem_empresa, String nome_fantasia_empresa, String sobre_empresa, int id_endereco_empresa,
			int cep_empresa, String estado_empresa, String cidade_empresa, String bairro_empresa, int numero_empresa,
			String endereco_empresa, String complemento_empresa) {
		super();
		this.id_empresa = id_empresa;
		this.cnpj_empresa = cnpj_empresa;
		this.razao_social_empresa = razao_social_empresa;
		this.imagem_perfil_empresa = imagem_perfil_empresa;
		this.imagem_empresa = imagem_empresa;
		this.nome_fantasia_empresa = nome_fantasia_empresa;
		this.sobre_empresa = sobre_empresa;
		this.id_endereco_empresa = id_endereco_empresa;
		this.cep_empresa = cep_empresa;
		this.estado_empresa = estado_empresa;
		this.cidade_empresa = cidade_empresa;
		this.bairro_empresa = bairro_empresa;
		this.numero_empresa = numero_empresa;
		this.endereco_empresa = endereco_empresa;
		this.complemento_empresa = complemento_empresa;
	}

	public JavaBeans(int id_ficha_observacao, String observacao) {
		super();
		this.id_ficha_observacao = id_ficha_observacao;
		this.observacao = observacao;
	}
	
	public JavaBeans(String nome_servico, String tipo_servico, String descricao_servico, int id_servico) {
		super();
		this.nome_servico = nome_servico;
		this.tipo_servico = tipo_servico;
		this.descricao_servico = descricao_servico;
		this.id_servico = id_servico;
	}

	public JavaBeans(int id_usuario, String nome_usuario, String cpf_usuario, String nascimento_usuario,
			int telefone_usuario, String email_usuario, String username_usuario, String senha_usuario, int cep_usuario,
			String endereco_usuario, String estado_usuario, String cidade_usuario, int numero_usuario,
			String complemento_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.cpf_usuario = cpf_usuario;
		this.nascimento_usuario = nascimento_usuario;
		this.telefone_usuario = telefone_usuario;
		this.email_usuario = email_usuario;
		this.username_usuario = username_usuario;
		this.senha_usuario = senha_usuario;
		this.cep_usuario = cep_usuario;
		this.endereco_usuario = endereco_usuario;
		this.estado_usuario = estado_usuario;
		this.cidade_usuario = cidade_usuario;
		this.numero_usuario = numero_usuario;
		this.complemento_usuario = complemento_usuario;
	}

	
	/**
	 * Métodos que buscam e setam os valores nos HTMLs 
	 * @return
	 */
	public int getId_agenda() {
		return id_agenda;
	}
	public void setId_agenda(int id_agenda) {
		this.id_agenda = id_agenda;
	}
	public String getDia_agenda() {
		return dia_agenda;
	}
	public void setDia_agenda(String dia_agenda) {
		this.dia_agenda = dia_agenda;
	}
	public String getHorario_inicio_agenda() {
		return horario_inicio_agenda;
	}
	public void setHorario_inicio_agenda(String horario_inicio_agenda) {
		this.horario_inicio_agenda = horario_inicio_agenda;
	}
	public String getHorario_fim_agenda() {
		return horario_fim_agenda;
	}
	public void setHorario_fim_agenda(String horario_fim_agenda) {
		this.horario_fim_agenda = horario_fim_agenda;
	}
	public String getServico_agenda() {
		return servico_agenda;
	}
	public void setServico_agenda(String servico_agenda) {
		this.servico_agenda = servico_agenda;
	}
	public int getId_banco_empresa() {
		return id_banco_empresa;
	}
	public void setId_banco_empresa(int id_banco_empresa) {
		this.id_banco_empresa = id_banco_empresa;
	}
	public String getBanco_empresa() {
		return banco_empresa;
	}
	public void setBanco_empresa(String banco_empresa) {
		this.banco_empresa = banco_empresa;
	}
	public int getAgencia_empresa() {
		return agencia_empresa;
	}
	public void setAgencia_empresa(int agencia_empresa) {
		this.agencia_empresa = agencia_empresa;
	}
	public int getDigito_empresa() {
		return digito_empresa;
	}
	public void setDigito_empresa(int digito_empresa) {
		this.digito_empresa = digito_empresa;
	}
	public String getTipo_conta_empresa() {
		return tipo_conta_empresa;
	}
	public void setTipo_conta_empresa(String tipo_conta_empresa) {
		this.tipo_conta_empresa = tipo_conta_empresa;
	}
	public String getConta_empresa() {
		return conta_empresa;
	}
	public void setConta_empresa(String conta_empresa) {
		this.conta_empresa = conta_empresa;
	}
	public int getId_compromisso() {
		return id_compromisso;
	}
	public void setId_compromisso(int id_compromisso) {
		this.id_compromisso = id_compromisso;
	}
	public String getDia_compromisso() {
		return dia_compromisso;
	}
	public void setDia_compromisso(String dia_compromisso) {
		this.dia_compromisso = dia_compromisso;
	}
	public String getHorario_inicio_compromisso() {
		return horario_inicio_compromisso;
	}
	public void setHorario_inicio_compromisso(String horario_inicio_compromisso) {
		this.horario_inicio_compromisso = horario_inicio_compromisso;
	}
	public String getHorario_fim_compromisso() {
		return horario_fim_compromisso;
	}
	public void setHorario_fim_compromisso(String horario_fim_compromisso) {
		this.horario_fim_compromisso = horario_fim_compromisso;
	}
	public int getId_contato() {
		return id_contato;
	}
	public void setId_contato(int id_contato) {
		this.id_contato = id_contato;
	}
	public String getNome_contato() {
		return nome_contato;
	}
	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}
	public String getEmail_contato() {
		return email_contato;
	}
	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}
	public int getTelefone_contato() {
		return telefone_contato;
	}
	public void setTelefone_contato(int telefone_contato) {
		this.telefone_contato = telefone_contato;
	}
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public int getCnpj_empresa() {
		return cnpj_empresa;
	}
	public void setCnpj_empresa(int cnpj_empresa) {
		this.cnpj_empresa = cnpj_empresa;
	}
	public String getRazao_social_empresa() {
		return razao_social_empresa;
	}
	public void setRazao_social_empresa(String razao_social_empresa) {
		this.razao_social_empresa = razao_social_empresa;
	}
	public String getImagem_perfil_empresa() {
		return imagem_perfil_empresa;
	}
	public void setImagem_perfil_empresa(String imagem_perfil_empresa) {
		this.imagem_perfil_empresa = imagem_perfil_empresa;
	}
	public String getImagem_empresa() {
		return imagem_empresa;
	}
	public void setImagem_empresa(String imagem_empresa) {
		this.imagem_empresa = imagem_empresa;
	}
	public String getNome_fantasia_empresa() {
		return nome_fantasia_empresa;
	}
	public void setNome_fantasia_empresa(String nome_fantasia_empresa) {
		this.nome_fantasia_empresa = nome_fantasia_empresa;
	}
	public String getSobre_empresa() {
		return sobre_empresa;
	}
	public void setSobre_empresa(String sobre_empresa) {
		this.sobre_empresa = sobre_empresa;
	}
	public int getId_endereco_empresa() {
		return id_endereco_empresa;
	}
	public void setId_endereco_empresa(int id_endereco_empresa) {
		this.id_endereco_empresa = id_endereco_empresa;
	}
	public int getCep_empresa() {
		return cep_empresa;
	}
	public void setCep_empresa(int cep_empresa) {
		this.cep_empresa = cep_empresa;
	}
	public String getEstado_empresa() {
		return estado_empresa;
	}
	public void setEstado_empresa(String estado_empresa) {
		this.estado_empresa = estado_empresa;
	}
	public String getCidade_empresa() {
		return cidade_empresa;
	}
	public void setCidade_empresa(String cidade_empresa) {
		this.cidade_empresa = cidade_empresa;
	}
	public String getBairro_empresa() {
		return bairro_empresa;
	}
	public void setBairro_empresa(String bairro_empresa) {
		this.bairro_empresa = bairro_empresa;
	}
	public int getNumero_empresa() {
		return numero_empresa;
	}
	public void setNumero_empresa(int numero_empresa) {
		this.numero_empresa = numero_empresa;
	}
	public String getEndereco_empresa() {
		return endereco_empresa;
	}
	public void setEndereco_empresa(String endereco_empresa) {
		this.endereco_empresa = endereco_empresa;
	}
	public String getComplemento_empresa() {
		return complemento_empresa;
	}
	public void setComplemento_empresa(String complemento_empresa) {
		this.complemento_empresa = complemento_empresa;
	}
	public int getId_ficha_observacao() {
		return id_ficha_observacao;
	}
	public void setId_ficha_observacao(int id_ficha_observacao) {
		this.id_ficha_observacao = id_ficha_observacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public int getId_servico() {
		return id_servico;
	}
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	public String getNome_servico() {
		return nome_servico;
	}
	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
	}
	public String getTipo_servico() {
		return tipo_servico;
	}
	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}
	public String getDescricao_servico() {
		return descricao_servico;
	}
	public void setDescricao_servico(String descricao_servico) {
		this.descricao_servico = descricao_servico;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	public String getNascimento_usuario() {
		return nascimento_usuario;
	}
	public void setNascimento_usuario(String nascimento_usuario) {
		this.nascimento_usuario = nascimento_usuario;
	}
	public int getTelefone_usuario() {
		return telefone_usuario;
	}
	public void setTelefone_usuario(int telefone_usuario) {
		this.telefone_usuario = telefone_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getUsername_usuario() {
		return username_usuario;
	}
	public void setUsername_usuario(String username_usuario) {
		this.username_usuario = username_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	public int getCep_usuario() {
		return cep_usuario;
	}
	public void setCep_usuario(int cep_usuario) {
		this.cep_usuario = cep_usuario;
	}
	public String getEndereco_usuario() {
		return endereco_usuario;
	}
	public void setEndereco_usuario(String endereco_usuario) {
		this.endereco_usuario = endereco_usuario;
	}
	public String getEstado_usuario() {
		return estado_usuario;
	}
	public void setEstado_usuario(String estado_usuario) {
		this.estado_usuario = estado_usuario;
	}
	public String getCidade_usuario() {
		return cidade_usuario;
	}
	public void setCidade_usuario(String cidade_usuario) {
		this.cidade_usuario = cidade_usuario;
	}
	public int getNumero_usuario() {
		return numero_usuario;
	}
	public void setNumero_usuario(int numero_usuario) {
		this.numero_usuario = numero_usuario;
	}
	public String getComplemento_usuario() {
		return complemento_usuario;
	}
	public void setComplemento_usuario(String complemento_usuario) {
		this.complemento_usuario = complemento_usuario;
	}
	
}