import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    /*
     * 1. FAZER CONEXÃO HTTP E BUSCAR OS TOP 250 FILMES
     * 2. PEGAR SÓ OS DADOS QUE INTERESSAM (TITULO, POSTER, CLASSIFICAÇÃO)
     * 3. EXIBIR E MANIPULAR OS DADOS
     */
    public static void main(String[] args) throws Exception {
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI endereco = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

    }
}
