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