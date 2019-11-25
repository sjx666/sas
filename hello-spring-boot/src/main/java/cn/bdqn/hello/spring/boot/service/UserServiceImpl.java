package cn.bdqn.hello.spring.boot.service;

import cn.bdqn.hello.spring.boot.dao.SmbmsUserMapper;
import cn.bdqn.hello.spring.boot.entity.SmbmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private SmbmsUserMapper userMapper;
    @Override
    public List<SmbmsUser> getUserList(){
        List<SmbmsUser> smbmsUsers = userMapper.selectAll();

        return smbmsUsers;
    }

    @Override
    public List<SmbmsUser> getUserByUserId(SmbmsUser user) {
        return userMapper.select(user);

    }

    @Override
    public int addUser(SmbmsUser user) {
        return userMapper.insert(user);
    }
}
