import backend.Command.CreateUserLoginCommand;
import backend.Query.ConsultarUserLoginQuery;
import backend.Model.UserLogin;

public class Main {
	public static void main (String[]args){
		CreateUserLoginCommand comando = new CreateUserLoginCommand();
		UserLogin userLogin = comando.inserir();

		ConsultarUserLoginQuery consulta = new ConsultarUserLoginQuery();
		consulta.mostra(userLogin);
	}
}
