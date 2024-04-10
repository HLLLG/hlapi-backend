package com.hlllg.hlapi.service;


import com.hlllg.hlapicommon.service.InnerUserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: HLLLG
 * @Date: 2024/04/06/10:38
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private InnerUserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        long interfaceInfoId = 1L;
        long userId = 1L;
        boolean b = userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
        Assertions.assertTrue(b);
    }
}