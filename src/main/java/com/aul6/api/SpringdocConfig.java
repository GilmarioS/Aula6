package com.aul6.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
    @Bean
    OpenAPI springShopOpenAPI() {
        Map<String, Object> extensions = new HashMap<>();
        extensions.put("Desenvolvedor", "Gilmario Santos");
        
        return new OpenAPI()
            .info(new Info().title("API Aula06 Restful com Documentação")
                .description("API Aula06 Restful utilizando Springdoc para documentação.")
                .version("1.0.0")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))

            .contact(new Contact()
            		.name(" Dev: Gilmario Santos") // Aqui você pode definir o nome do contato
            	    .email("aula6@gmail.com")
                    
                )
            )

            .extensions(extensions)
            
            .externalDocs(new ExternalDocumentation()
            		            		
                .description("Link do Repositório da Aplicação - APIRestful Documentation")
                .url("https://github.com/GilmarioS/Aula6")
            );
    }
}
