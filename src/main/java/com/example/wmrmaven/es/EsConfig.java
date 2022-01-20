package com.example.wmrmaven.es;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wumoran
 * @version 1.0
 * @description es链接配置
 * @date 2021/10/15 15:15
 */

@Configuration
public class EsConfig {


    @Bean
    public TestBean testConfig() {
        return new TestBean();
    }

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestClientBuilder restClient = RestClient.builder(
                new HttpHost("localhost", 9200, "http"));
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(restClient);
        return restHighLevelClient;
    }
}