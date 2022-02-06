package quest�o7;
import java.util.Calendar;

public class TesteAutenticacao extends Usuario {	
	public static void main(String[] args) {
		
		//Para usar a data
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		//Cada posi��o dos arrays correspondem ao nome de usu�rio e senha
		String[] arrayUser = {"Kaio"};
		int[] arraySenha = {29170};
		
		//Cria��o de um novo usu�rio e defini��o do user e senha
		Usuario kaio = new Usuario();
		kaio.setSenha(arraySenha[0]);
		kaio.setUser(arrayUser[0]);
		

		//Entrada para verifica��o do usu�rio e senha
		boolean autenticouUser1 = kaio.autenticaUser("Kaio", 29170);
		
		//Confirma��o se entrou ou n�o no sistema
		if(autenticouUser1 == true) {
			//Mensagens de acordo com o hor�rio
			if(hora >= 6 && hora < 12){
				System.out.print("Bom Dia! ");
			}else if(hora >= 12 && hora < 18){
				System.out.print("Boa Tarde! ");
			}else if(hora >= 18 && hora <= 23){
				System.out.print("Boa Noite! ");
			}else {
				System.out.print("Boa Madrugada! ");
			}
			System.out.println("Voc� se logou ao nosso sistema");
		}else {
			System.out.println("Usu�rio e/ou senha incorretos.");
		}

	}

}

