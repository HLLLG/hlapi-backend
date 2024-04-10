package com.hlllg.hlapiinterface;

import com.hlllg.hlapiclientsdk.client.HlApiClient;
import com.hlllg.hlapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class HlapiInterfaceApplicationTests {

    @Resource
    private HlApiClient hlApiClient;

    @Test
    void contextLoads() {
        String hl = hlApiClient.getNameByGet("hl");
        User user = new User();
        user.setUsername("hlllg");
        String userNameByPost = hlApiClient.getUserNameByPost(user);
        System.out.println(hl);
        System.out.println(userNameByPost);
    }

}
