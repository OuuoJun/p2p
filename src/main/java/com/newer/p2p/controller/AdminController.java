package com.newer.p2p.controller;

import com.newer.p2p.domain.Admin;
import com.newer.p2p.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 用户登陆
     * @param ausername
     * @param apassword
     * @param session
     * @return
     */
    @RequestMapping("AdminLogin")
    public boolean AdminLogin(@RequestParam("username") String ausername, @RequestParam("password") String apassword, HttpSession session){

        boolean flag = false;

      Admin admin =adminService.AdminLogin(ausername,apassword);

      if(admin!=null){
          admin.setApassword("******");
          session.setAttribute("admin",admin);
          System.out.println(admin);
          flag = true;
      }
        return  flag;
    }

    @RequestMapping("AdminRegister")
    public int AdminRegister(Admin admin){
        admin.setRegister(new Date());
        return adminService.AdminRegister(admin);
    }
}
