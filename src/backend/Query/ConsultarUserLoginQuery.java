package backend.Query;
import backend.Model.UserLogin;
public class ConsultarUserLoginQuery {
	public void mostra(UserLogin userLogin){
		System.out.println("\n===== Dados do Usuário =====");
		System.out.println("Usuário: " + userLogin.getLogin());
		System.out.println("Senha: " + userLogin.getPassword());
		System.out.println("Nome de Usuário: " + userLogin.getUsername());
	}
}
