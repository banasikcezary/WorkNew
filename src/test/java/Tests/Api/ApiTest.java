package Tests.Api;

import ApiPage.Cassh;
import ApiPage.Rate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private Response response;
    private RequestSpecification request;

    List<Cassh> casshList;
    List<Rate> rateList;
    Cassh[] kasa;




    @Given("Set initial configuration")
    public void set_initial_configuration() {
        RestAssured.baseURI="http://api.nbp.pl/";
        RestAssured.basePath="api/exchangerates/tables/";
        RestAssured.filters(new ErrorLoggingFilter());
        request=given();
    }

    @When("Pobierz kursy walut")
    public void pobierz_kursy_walut() {
        response=request.when().get("A");


    }
    @When("Wyświetl kurs dla waluty o kodzie: {string}")
    public void wyświetl_kurs_dla_waluty_o_kodzie(String string) {
        kasa=response.then().extract().as(Cassh[].class);
        casshList= Arrays.asList(kasa);
        rateList=casshList.get(0).getRates();

        rateList.stream()
                .filter(x->x.getCode().equals(string))
                .map(x->x.getMid())
                .forEach(System.out::println);

    }
    @When("Wyświetl kurs dla waluty o nazwie: {string}")
    public void wyświetl_kurs_dla_waluty_o_nazwie(String string) {
        rateList.stream()
                .filter(x->x.getCurrency().equals(string))
                .map(x->x.getMid())
                .forEach(System.out::println);

    }
    @When("Wyświetl waluty o kursie powyżej: {int}")
    public void wyświetl_waluty_o_kursie_powyżej(Integer int1) {

        rateList.stream()
                .filter(x->x.getMid()>int1)
                .map(x->x.getCurrency())
                .forEach(System.out::println);


    }
    @When("Wyświetl waluty o kursie poniżej: {int}")
    public void wyświetl_waluty_o_kursie_poniżej(Integer int1) {

        rateList.stream()
                .filter(x->x.getMid()<int1)
                .map(x->x.getCurrency())
                .forEach(System.out::println);

    }
}
