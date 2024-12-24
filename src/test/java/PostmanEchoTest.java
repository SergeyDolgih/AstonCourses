import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostmanEchoTest {

    @BeforeEach
    void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    @DisplayName("Проверка метода GET")
    public void checkGet(){
        given().log().all()
                .when().get("/get?foo1=bar1&foo2=bar2").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.foo1", equalTo("bar1"))
                .and().body("args.foo2", equalTo("bar2"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-request-start", notNullValue())
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    @DisplayName("Проверка метода POST Raw Text")
    public void checkPostRawText(){
        String textData = "This is expected to be sent back as part of response body.";
        given().log().all().body(textData)
                .header("Content-Type", "text/plain")
                .header("Accept-encoding", "gzip, deflate, br")
                .when().post("/post").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.get(0)", equalTo(null))
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("files.get(0)", equalTo(null))
                .and().body("form.get(0)", equalTo(null))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    @DisplayName("Проверка метода POST Form Data")
    public void checkPostFormData(){
        given().log().all()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .header("Accept-encoding", "gzip, deflate, br")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when().post("/post").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.get(0)", equalTo(null))
                .and().body("data", equalTo(""))
                .and().body("files.get(0)", equalTo(null))
                .and().body("form.foo1", equalTo("bar1"))
                .and().body("form.foo2", equalTo("bar2"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.content-length", equalTo("19"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=utf-8"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .and().body("json.foo1", equalTo("bar1"))
                .and().body("json.foo2", equalTo("bar2"))
                .and().body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    @DisplayName("Проверка метода PUT")
    public void checkPUT(){
        String textData = "This is expected to be sent back as part of response body.";
        given().log().all().body(textData)
                .header("Content-Type", "text/plain")
                .header("Accept-encoding", "gzip, deflate, br")
                .when().put("/put").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.get(0)", equalTo(null))
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("files.get(0)", equalTo(null))
                .and().body("form.get(0)", equalTo(null))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    @DisplayName("Проверека метода PATCH")
    public void checkPatch(){
        String textData = "This is expected to be sent back as part of response body.";
        given().log().all().body(textData)
                .header("Content-Type", "text/plain")
                .header("Accept-encoding", "gzip, deflate, br")
                .when().patch("/patch").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.get(0)", equalTo(null))
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("files.get(0)", equalTo(null))
                .and().body("form.get(0)", equalTo(null))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    @DisplayName("Проверка метода DELETE")
    public void checkDelete(){
        String textData = "This is expected to be sent back as part of response body.";
        given().log().all().body(textData)
                .header("Content-Type", "text/plain")
                .header("Accept-encoding", "gzip, deflate, br")
                .when().delete("/delete").then().log().body().statusCode(200)
                .assertThat()
                .and().body("args.get(0)", equalTo(null))
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("files.get(0)", equalTo(null))
                .and().body("form.get(0)", equalTo(null))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", notNullValue())
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("https://postman-echo.com/delete"));
    }
}
