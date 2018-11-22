# API_tarefas
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
     <groupId>br.com.brunodiniz</groupId>
    <artifactId>retrofit</artifactId>
    <version>1.0-SNAPSHOT</version>
     <dependencies>
         <dependency>
            <groupId>com.squareup.retrofit2</groupId>
            <artifactId>retrofit</artifactId>
            <version>2.4.0</version>
        </dependency>
        <dependency>
            <groupId>com.squareup.retrofit2</groupId>
            <artifactId>converter-gson</artifactId>
            <version>2.4.0</version>
        </dependency>
     </dependencies>
 </project> 
 
 <?xml version="1.0" encoding="UTF-8"?>
<module type="JAVA_MODULE" version="4" /> 

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
 public class Main{
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gist.githubusercontent.com/leandersonandre/")
                 .addConverterFactory(GsonConverterFactory.create())
                .build();
         TesteApi api = retrofit.create(TesteApi.class);
         try {
            Call<Time> call = api.getTime();
             Response<Time> r = call.execute();
             Time t = r.body();
             System.out.println(t);
         }catch(Exception e) {
            e.printStackTrace();
        }
    }
} 
  
  import retrofit2.Call;
import retrofit2.http.GET;
 public interface TesteApi {
     @GET("6f8aeaaa99baca45b9c2020b5f3c85e7/raw/091c5d46f514a25e68f174457bebc66c85eac11c/chelsea.json")
    Call<Time> getTime();
 } 
  
  public class Time {
     private String nome;
    private String pais;
    private String estadio;
    private String treinador;
    private String escudo;
     @Override
    public String toString() {
        return "Time [nome=" + nome + ", pais=" + pais + ", estadio=" + estadio + ", treinador=" + treinador
                + ", escudo=" + escudo + "]";
    }
     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public String getTreinador() {
        return treinador;
    }
    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    public String getEscudo() {
        return escudo;
    }
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
 } 
