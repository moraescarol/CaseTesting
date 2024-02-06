package in.automationtesting.pratice.taskit.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Funcionalidade de Sign Up")
public class SignUpTests {
    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testRegistrarUmNovoUsuarioComDadosValidos() {
        // Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Acessar o site do Taskit
        navegador.get("https://practice.automationtesting.in");

        // Acessar o menu Minha Conta
        navegador.get("https://practice.automationtesting.in/my-account");

        // Digitar e-mail válido no campo Endereço de email
        navegador.findElement(By.id("reg_email")).sendKeys("fulanodetal_242@gmail.com");

        // Digitar senha válida no campo Senha
        navegador.findElement(By.id("reg_password")).sendKeys("C@In2024*");

        // Clicar no botão Registro

    }
}
