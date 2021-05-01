package com.xfactor.lably.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.xfactor.lably.entity.Lab;

@RestController
@RequestMapping("/Labs")
public class LabControler {

    ArrayList<Lab> labs = new ArrayList<>();

    @PostMapping("/addAdmin")
    public Lab addAdmin(@RequestBody Lab A1) {
        labs.add(A1);
        return A1;
    }


    @GetMapping("/getAdmin")
    public ArrayList<Lab> getAdmin() {
        for(int i =0;i<5;i++)
        {
            Lab obj=new Lab();
            obj.setName("kkk");
            obj.setAddress("Kolkata");
            obj.setPhone("9090909090909");
            obj.setPincode("123456");
            labs.add(obj);
        }
        return labs;
    }

    @GetMapping("/getAdmin/{name}")
    public Lab getAdmin(@PathVariable String name) {
        Lab res=new Lab();
        for (Lab k : labs) 
        { 
            if(k.getName().equals(name))
            {
                return k;
            }
        }
        return res;
    }
}
