package com.newer.p2p.service;

import com.newer.p2p.domain.Admin;
import com.newer.p2p.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin AdminLogin(String ausername,String apassword){
        return adminMapper.AdminLogin(ausername,apassword);
    }

    public int AdminRegister(Admin admin){

        return adminMapper.AdminRegister(admin);
    }
}
