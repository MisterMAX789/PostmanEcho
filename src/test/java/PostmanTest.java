import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldReturnDemoAccounts() {
        //Given - When - Then
        //Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));
    }
}
