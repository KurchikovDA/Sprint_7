package order;

import static constants.ApiConstants.SCOOTER_URL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

// Класс Client используется для предоставления базовой спецификации запроса (RequestSpecification),
// которая будет использоваться при выполнении запросов к API Яндекс.Самокат.
public class Client {
    // Метод getSpec используется для создания и возвращения базовой спецификации запроса
    protected RequestSpecification getSpec() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON) // Устанавливает тип контента запроса как JSON
                .setBaseUri(SCOOTER_URL) // Устанавливает базовый URL для запросов
                .build();  // Строит и возвращает экземпляр RequestSpecification
    }
}
