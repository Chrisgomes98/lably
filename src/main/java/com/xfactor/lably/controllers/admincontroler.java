package com.xfactor.lably.controllers;

import java.util.*;

import com.xfactor.lably.Repository.AdminRepository;
import com.xfactor.lably.entity.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class admincontroler {

    @Autowired
    AdminRepository adminRepository;

    @PostMapping("/addAdmin")
    public admin addAdmin(@RequestBody admin A1) {
        admin PersistedAdmin= adminRepository.save(A1);
        return PersistedAdmin;
    }

    @GetMapping("/getAdmins")
    public List<admin> getAdmins() {
        List<admin> persistAdmins=adminRepository.findAll();
        return persistAdmins;
    }

    @GetMapping("/getAdmin/{name}")
    public admin getAdmin(@PathVariable String name) {
        admin res=null;
        List<admin> persistAdmins=adminRepository.findAll();
        for (admin x : persistAdmins)
        {
            if(x.getName().equalsIgnoreCase(name))
                return x;
        }
        return res;
    }
}
