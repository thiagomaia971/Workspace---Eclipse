package ClassLibary;

public class Funcionario_ {
		int id;
		String nome;
		String enderešo;
		String telefone;
		String cpf;
		String dataNasc;
		int idade;
		int rg;
		int qtFunc;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEnderešo() {
			return enderešo;
		}
		public void setEnderešo(String enderešo) {
			this.enderešo = enderešo;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getDataNasc() {
			return dataNasc;
		}
		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getRg() {
			return rg;
		}
		public void setRg(int rg) {
			this.rg = rg;
		}
	
		public void exibirFunc(){
			System.out.println("<--------------------------------------Funcionario----------------------------------->");
			System.out.printf(
									"| ID: %-4d  |  Nome: %-100s  |  Enderešo: %-100s  | Telefone: %-14s | CPF: %-14s | Data de Nascimento: %-10s | Idade: %-3d | RG: %-14s| \n",
													getId(),getNome(),getEnderešo(),getTelefone(),getCpf(),getDataNasc(),getIdade(),getRg());
		}
	
}
