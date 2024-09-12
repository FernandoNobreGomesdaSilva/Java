package dio.springboot;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json) {
        // Corrigido o método from.Json para fromJson
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
