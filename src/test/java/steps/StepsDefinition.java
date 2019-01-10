package steps;
import Funcionalidad.MainClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsDefinition {
	@Given("^Aplicacion (.*)$")
	public void abrirBrowser(String url) {
		MainClass.StartBrowser(url);
	}
	
	@Then("^Registrar usuario: (.*) y contraseña: (.*)$")
	public void registrar(String user,String password ) {
		MainClass.Registrar(user, password, password);
	}
	
	@Then("^Loguear usuario: (.*) y contraseña: (.*)$")
	public void login(String user, String password) {
		MainClass.Login(user, password);
	}
	
	@Then("^Logout$")
	public void logout() {
		MainClass.Logout();
	}
	
	@And("^Limpiar BD$")
	public void finalmente() {
		MainClass.MysqlConsul();
	}
	
	
}
