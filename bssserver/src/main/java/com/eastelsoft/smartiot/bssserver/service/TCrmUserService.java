package com.eastelsoft.smartiot.bssserver.service;

import com.eastelsoft.smartiot.bssserver.domain.TCrmUser;

import java.util.List;


public interface TCrmUserService {
     void saveCrmUser(TCrmUser crmUser);
     List<TCrmUser> queryListByPage(String accont, int pageNum, int pageSize);
}
