package brian.com.woocommerce.service;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Brian  on 06/02/2017.
 */

public class RetroClient {
    /********
     * URLS
     *******/
    private static final String ROOT_URL = "http://tangtkdropbox1.esy.es/";

    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        OAuthInterceptor oauth1Woocommerce = new OAuthInterceptor.Builder()
                .consumerKey("ck_e6273f2bc404d8d0cd5c47599ddc94a0d1f88c07")
                .consumerSecret("cs_d69e3ba165386fa83aee523ae840b1dc09f9ba83")
                .build();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .addInterceptor(oauth1Woocommerce)// Interceptor oauth1Woocommerce added
                .build();

        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
