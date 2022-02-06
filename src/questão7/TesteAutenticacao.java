package questão7;
import java.util.Calendar;

public class TesteAutenticacao extends Usuario {	
	public static void main(String[] args) {
		
		//Para usar a data
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		//Cada posição dos arrays correspondem ao nome de usuário e senha
		String[] arrayUser = {"Kaio"};
		int[] arraySenha = {29170};
		
		//Criação de um novo usuário e definição do user e senha
		Usuario kaio = new Usuario();
		kaio.setSenha(arraySenha[0]);
		kaio.setUser(arrayUser[0]);
		

		//Entrada para verificação do usuário e senha
		boolean autenticouUser1 = kaio.autenticaUser("Kaio", 29170);
		
		//Confirmação se entrou ou não no sistema
		if(autenticouUser1 == true) {
			//Mensagens de acordo com o horário
			if(hora >= 6 && hora < 12){
				System.out.print("Bom Dia! ");
			}else if(hora >= 12 && hora < 18){
				System.out.print("Boa Tarde! ");
			}else if(hora >= 18 && hora <= 23){
				System.out.print("Boa Noite! ");
			}else {
				System.out.print("Boa Madrugada! ");
			}
			System.out.println("Você se logou ao nosso sistema");
		}else {
			System.out.println("Usuário e/ou senha incorretos.");
		}

	}

}

