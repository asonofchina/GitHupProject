package com.eastelsoft.smartiot.bssserver.controller;

import com.eastelsoft.smartiot.bssserver.domain.TCrmUser;
import com.eastelsoft.smartiot.bssserver.service.TCrmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 主页
 * Created by tengj on 2017/4/10.
 */

@RestController
@RequestMapping("/test")
public class TestController extends  AbstractController{
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String, Object> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        Map<String, Object> mp = new HashMap<>();
        List list = new ArrayList();
        for (int i =0;i < 10;i++){
            TCrmUser user = new TCrmUser();
            user.setProductId("product"+i);
            user.setUserId("userid"+i);
            user.setCustomerId("customer"+i);
            list.add(user);
        }
        mp.put("tableData",list);
        mp.put("count",list.size());
        return mp;
    }
}
