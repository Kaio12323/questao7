package questão7;

public class Usuario{
	private int senha;
	private String user;
	
	public String getUser() {
		return user;
	}
	public int getSenha() {
		return senha;
	}
	// Define usuário e senha
	public void setUser(String user){
		this.user = user;
	}
	public void setSenha(int senha) {
		this.senha = senha;	
	}
	
	// Confere usuário e senha
	public boolean autenticaUser(String user, int senha) {
		if(this.user == user && this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	

		

}

