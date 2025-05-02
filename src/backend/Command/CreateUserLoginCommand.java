package backend.Command;
import java.util.Scanner;
import backend.Model.UserLogin;
public class CreateUserLoginCommand {
	public UserLogin inserir(){
		Scanner scanner = new Scanner(System.in);
		//colocar o login
		System.out.println("Cadastre um login :");
		String login = scanner.nextLine();
		//cadastra uma senha
		System.out.println("Registre uma senha :");
		String password = scanner.nextLine();
		//Dar um nome de usuario
		System.out.println("Coloque um Nome :");
		String username = scanner.nextLine();
        
		scanner.close();
		return new UserLogin(login, password, username);
	}
}
