package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xfactor.lably.entity.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class admincontroler {
    
    
    @RestController
    @RequestMapping("/admin")
    public class TestController {

        ArrayList<admin> admins = new ArrayList<>();

        @PostMapping("/addAdmin")
        public admin addAdmin(@RequestBody admin A1) {
            admins.add(A1);
            return A1;
        }


        @GetMapping("/getAdmin")
        public ArrayList<admin> getAdmin() {
            return admins;
        }

        @GetMapping("/getAdmin/{name}")
        public admin getAdmin(@PathVariable String name) {
            admin res;
            for (admin k : admins) 
            { 
                if(k.getName().equals(name))
                {
                    return k;
                }
            }
            return res;
        }
}
