package com.hlllg.hlapiclientsdk;

import com.hlllg.hlapiclientsdk.client.HlApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HLLLG
 * @Date: 2024/04/04/21:34
 */
@Configuration
@ConfigurationProperties("hlapi.client")
@Data
@ComponentScan
public class HLApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public HlApiClient hlApiClient() {
        return new HlApiClient(accessKey, secretKey);
    }
}
