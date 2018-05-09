package com.eastelsoft.smartiot.bssserver.service.impl;

import com.eastelsoft.smartiot.bssserver.dao.TCrmUserMapper;
import com.eastelsoft.smartiot.bssserver.domain.TCrmUser;
import com.eastelsoft.smartiot.bssserver.service.TCrmUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCrmUserServiceImpl implements TCrmUserService {
    @Autowired
    private TCrmUserMapper tCrmUserMapper;

    public void saveCrmUser(TCrmUser crmUser){
        tCrmUserMapper.insert(crmUser);
    }

    @Override
    public List<TCrmUser> queryListByPage(String accont, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize,"UPDATED_TIME desc");
        return tCrmUserMapper.selectAll();
    }
}
