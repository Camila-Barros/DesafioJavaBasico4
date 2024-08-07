import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConcultaCep {

    public DadosEndereco buscaEndereco(String cep){
        URI endereco = URI.create("http://viacep.com.br/ws/" + cep + "/json");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), DadosEndereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível encontrar o endereço apartir do CEP informado.");
        }


    }
}
