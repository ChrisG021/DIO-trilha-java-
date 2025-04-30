package api.spring_api_swagger.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Title - Rest API")
                .description("API exemplo de uso de Swagger com Spring Boot 3 (SpringDoc)")
                .version("1.0")
                .contact(new Contact()
                    .name("chris")
                    .url("http://localhost:8080")
                    .email("chris@gmail.com")
                )
            );
    }
}