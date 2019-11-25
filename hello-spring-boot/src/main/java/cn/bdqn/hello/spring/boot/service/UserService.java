package cn.bdqn.hello.spring.boot.service;

import cn.bdqn.hello.spring.boot.dao.SmbmsUserMapper;
import cn.bdqn.hello.spring.boot.entity.SmbmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<SmbmsUser> getUserList();

    public List<SmbmsUser> getUserByUserId(SmbmsUser user);

    public int addUser(SmbmsUser user);





}
