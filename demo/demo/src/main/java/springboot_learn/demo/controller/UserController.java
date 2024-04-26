package springboot_learn.demo.controller;


import org.springframework.web.bind.annotation.*;
import springboot_learn.demo.model.entity.UserEntity;

@RestController
@RequestMapping("userApi")
public class UserController {
    @GetMapping("getUser")
    public UserEntity getUser(){
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setName("张三");
        userEntity1.setAge(18);
        return userEntity1;
    }

    @PostMapping("sendUser")
    public UserEntity sendUser(@RequestBody UserEntity userEntity){

        System.out.println(userEntity.getName());
        return userEntity;
    }

}
