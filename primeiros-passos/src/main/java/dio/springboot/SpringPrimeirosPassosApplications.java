package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplications {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassosApplications.class, args);
    }

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            // Corrigido o JSON de exemplo
            String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praca da Se\", \"localidade\": \"Sao Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do cep: " + response.getCep() + ", Logradouro: " + response.getLogradouro() + ", Localidade: " + response.getLocalidade());
            
        };
    }
}
