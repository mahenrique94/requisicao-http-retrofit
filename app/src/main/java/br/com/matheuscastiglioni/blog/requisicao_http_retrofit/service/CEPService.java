package br.com.matheuscastiglioni.blog.requisicao_http_retrofit.service;

import br.com.matheuscastiglioni.blog.requisicao_http_retrofit.model.CEP;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by matheus on 13/11/17.
 */

public interface CEPService {

    @GET("cep/find/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);

}
