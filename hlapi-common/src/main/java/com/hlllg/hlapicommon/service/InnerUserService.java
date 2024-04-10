package com.hlllg.hlapicommon.service;

import com.hlllg.hlapicommon.model.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户服务
 *
 */
public interface InnerUserService {

    /**
     * 从数据库中查是否已分配给用户密钥（accessKey, secreteKey)
     * @param accessKey
     * @return
     */
    User getInvokeUser(@Param("accessKey") String accessKey);
}
