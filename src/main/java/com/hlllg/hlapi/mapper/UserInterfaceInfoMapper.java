package com.hlllg.hlapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlllg.hlapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-04-05 19:20:56
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




