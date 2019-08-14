package com.imooc.miaoshaproject;

import com.imooc.miaoshaproject.dao.UserDOMapper;
import com.imooc.miaoshaproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.imooc.miaoshaproject"})
@RestController
@MapperScan("com.imooc.miaoshaproject.dao")
public class App {
    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home(){
      UserDO userDo=  userDOMapper.selectByPrimaryKey(1);
      if(userDo==null){
          return "用户估对象不存在";
      }else {
          return userDo.getName();
      }
    }
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class,args);
    }
}
