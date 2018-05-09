package com.eastelsoft.smartiot.bssserver.controller;

import com.eastelsoft.smartiot.bssserver.domain.TCrmUser;
import com.eastelsoft.smartiot.bssserver.service.TCrmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

/** 主页
 * Created by tengj on 2017/4/10.
 */

@RestController
@RequestMapping("/user")
public class UserController  extends  AbstractController{
    @Autowired
    private TCrmUserService tCrmUserService;
    @RequestMapping("/main")
    public String main(Model model){
        model.addAttribute("cx", getContextPath()+"/");
        return "main";
    }

    @RequestMapping("/getUsers")
    public TCrmUser getUsers(){
        TCrmUser tCrmUser = new TCrmUser();
        tCrmUser.setUserId("teee");
        return tCrmUser;
    }
    @RequestMapping("/save")
    public void  saveUser(@RequestBody TCrmUser user){
        TCrmUser tCrmUser = new TCrmUser();
        tCrmUser.setCustomerId("ttt");
        tCrmUserService.saveCrmUser(tCrmUser);

    }
    @RequestMapping("/test")
    public void test(){
        TCrmUser tCrmUser = new TCrmUser();
        tCrmUser.setCustomerId("ttt");
        tCrmUserService.saveCrmUser(tCrmUser);
    }
    @GetMapping("/getDemo/{userId}")
    public TCrmUser getUser(@PathVariable String userId){
        return null;
    }
}
