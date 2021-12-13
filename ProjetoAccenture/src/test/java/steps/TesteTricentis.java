package steps;

import com.github.javafaker.Faker;

import elements.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Browser;
import pages.Insurance;
import pages.Metodos;

public class TesteTricentis {
	Browser browser = new Browser();
	Insurance truck = new Insurance();
	Metodos metodos = new Metodos();
	Elements elementos = new Elements();
	Faker faker = new Faker();

	@Given("acessar o site da tricentis sampleapp {string}")
	public void acessar_o_site_da_tricentis_sampleapp(String site) {
		browser.abrirNavegador("chrome", site);

	}

	@And("fill the vehicle data form")
	public void fill_the_vehicle_data_form() {
		truck.dadosVeiculo("BMW", "Scooter", "1500", "100", "11/28/2020", "5", "3", "Gas", "250", "450", "50000",
				"30000");

	}

	@And("fill the insuransse data form")
	public void fill_the_assurance_data_form() {
		truck.dadosSeguro("Leonardo", "Zanatta", "04/14/1983", "Brazil", "1423658", "Unemployed");
	
	}

	@And("fill the product data form")
	public void fill_the_product_data_form() {
		truck.dadosProduto("12/12/2022", "5.000.000,00", "Bonus 3", "Full Coverage", "No");

	}

	@And("select for the payment option")
	public void select_for_the_payment_option() {
		truck.dadosPreco();

	}

	@And("fill out the quote")
	public void fill_out_the_quote() {
		truck.enviarCotacao("testeaccenture@test.com", "Test2", "Tesstt@121", "Tesstt@121",
				"Accenture test completed successfully");

	}

	@Then("i validate the sending email message successfully")
	public void i_validate_the_sending_email_message_successfully() {
		metodos.pausa(5000);
		metodos.validarTexto(elementos.getSendEmail(), "Sending e-mail success!");
		metodos.fecharNavegador();
		
	}

}
