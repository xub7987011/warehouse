package com.example.demothree.contraller;

import com.example.demothree.entity.UserEntity;
import com.example.demothree.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJpa userJpa;

    /**
     * 查询用户
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> qryList(){
        return  userJpa.findAll();
    }

    /**
     * 新增、、更新
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity user){
        return  userJpa.save(user);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> qryList(Long id){
        userJpa.deleteById(id);
        return  userJpa.findAll();
    }


}
