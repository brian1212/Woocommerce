package brian.com.woocommerce.service;

import java.util.List;
import java.util.Map;

import brian.com.woocommerce.model.OrderResponse;
import brian.com.woocommerce.model.ProductResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;


public interface ApiService {

//    @GET("wp-json/wc/v1/products/")
//    Call<List<ProductResponse>> getProducts(@Query("page") int page, @Query("per_page") int perPage);

    @GET("wp-json/wc/v1/products/")
    Call<List<ProductResponse>> getProducts();

    @GET("/wp-json/wc/v1/products/{id}")
    Call<ProductResponse> getProductById(@Path("id") int id);

    @FormUrlEncoded
    @POST("/wp-json/wc/v1/orders")
    Call<OrderResponse> postOrders(@FieldMap Map<String, String> parameters);
}
