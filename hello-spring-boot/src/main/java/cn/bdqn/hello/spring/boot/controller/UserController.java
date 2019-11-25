package cn.bdqn.hello.spring.boot.controller;

import cn.bdqn.hello.spring.boot.entity.SmbmsUser;
import cn.bdqn.hello.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String saHai(Model model){
        List<SmbmsUser> userList = userService.getUserList();
        model.addAttribute("userlist",userList);
        System.out.print("hahahha");
        return  "index";
    }
    //根据id查询所有的用户信息
    @RequestMapping("/ds")
    public String ss(Model model , SmbmsUser user){
        List<SmbmsUser> userList = userService.getUserByUserId(user);
        model.addAttribute("user",userList);
        return  "home";
    }
    @RequestMapping("/add")
    public String addUsers(SmbmsUser user){
      int count=  userService.addUser(user);
      if(count>0){
          return "redirect:index";
      }
        return "add";
    }
    @RequestMapping("adds")
    public String add_user(){
        return "add";
    }



}
