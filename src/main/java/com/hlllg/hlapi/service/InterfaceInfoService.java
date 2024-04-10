package com.hlllg.hlapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hlllg.hlapicommon.model.entity.InterfaceInfo;

/**
* @author Lenovo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-04-03 23:33:26
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
