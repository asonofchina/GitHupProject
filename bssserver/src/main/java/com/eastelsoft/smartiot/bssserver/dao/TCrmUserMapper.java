package com.eastelsoft.smartiot.bssserver.dao;

import com.eastelsoft.smartiot.bssserver.domain.TCrmUser;
import java.util.List;

public interface TCrmUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TCrmUser record);

    TCrmUser selectByPrimaryKey(String userId);

    List<TCrmUser> selectAll();

    int updateByPrimaryKey(TCrmUser record);
}