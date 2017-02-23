package brian.com.woocommerce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import brian.com.woocommerce.model.OrderResponse;
import brian.com.woocommerce.model.ProductResponse;
import brian.com.woocommerce.service.ApiService;
import brian.com.woocommerce.service.RetroClient;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btnUp;
    ApiService api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnUp = (Button) findViewById(R.id.btn_up);

         api = RetroClient.getApiService();
        Call<List<ProductResponse>> call = api.getProducts();

        call.enqueue(new Callback<List<ProductResponse>>() {
            @Override
            public void onResponse(Call<List<ProductResponse>> call, Response<List<ProductResponse>> response) {
                List<ProductResponse> result = response.body();
                Log.d("aaa", result.get(0).getName());
            }

          @Override
            public void onFailure(Call<List<ProductResponse>> call, Throwable t) {
                Log.d("error", t.getMessage());
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ApiService api = RetroClient.getApiService();
                OrderResponse orderResponse = new OrderResponse();
                orderResponse.setId(158);

                Map<String, String> param = new HashMap<>();
                param.put("id", String.valueOf(orderResponse.getId()));

                Call<OrderResponse> call = api.postOrders(param);
                call.enqueue(new Callback<OrderResponse>() {
                    @Override
                    public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response) {
                    }

                    @Override
                    public void onFailure(Call<OrderResponse> call, Throwable t) {

                    }
                });
            }
        });
    }

//    @OnClick(R.id.btn_up)
//    public void postOrder() {
//
//        ApiService api = RetroClient.getApiService();
//        OrderResponse orderResponse = new OrderResponse();
//        orderResponse.setId(158);
//
//        Map<String, String> param = new HashMap<>();
//        param.put("id", String.valueOf(orderResponse.getId()));
//        Call<OrderResponse> call = api.postOrders(param);
//        call.enqueue(new Callback<OrderResponse>() {
//            @Override
//            public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<OrderResponse> call, Throwable t) {
//
//            }
//        });
//    }
}
