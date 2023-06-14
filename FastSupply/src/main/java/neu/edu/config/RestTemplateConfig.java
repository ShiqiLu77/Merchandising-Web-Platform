package neu.edu.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import okhttp3.OkHttpClient;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory());
        return restTemplate;
    }
    
    // 设置连接池
    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(15000);
        factory.setReadTimeout(5000);
        return factory;
    }
    
//
//    private ClientHttpRequestFactory getClientHttpRequestFactory(){OkHttpClient okHttpClient = new OkHttpClient.Builder()
//            .connectTimeout(50, TimeUnit.SECONDS)
//            .writeTimeout(50, TimeUnit.SECONDS)
//            .readTimeout(50, TimeUnit.SECONDS)
//            .build();
//    return new OkHttp3ClientHttpRequestFactory(okHttpClient);
//   }
}
