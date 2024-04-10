package com.hlllg.hlapiinterface.controller;

import com.hlllg.hlapiclientsdk.model.User;
import com.hlllg.hlapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 api
 */
@RestController()
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("hlllg"));
        return "GET 你的名字是 " + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是 " + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String body = request.getHeader("body");
//        String sign = request.getHeader("sign");
//        // todo 从数据库中查是否已分配给用户权限
//        if (!"hlllg".equals(accessKey)) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//        // todo 实际情况是从数据库中查出 secretKey
//        String serverSign = SignUtils.genSign(body, "abcdefg");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
        return "POST 用户名是：" + user.getUsername();
    }
}
