package br.com.paulamilani.Locadora;

import jdk.jfr.ContentType;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocadoraApplicationTests extends TestCase {

    @Test
    public void TestApi() {

        String uri = "https://jsonplaceholder.typicode.com/todos/1\n";
        given()
                .relaxedHTTPSValidation()
                .param("userId", "1")
                .param("id", "'1'")
                .when()
                .get(uri)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON);

    }

}
