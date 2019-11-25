package cn.bdqn.hello.spring.boot;


import cn.bdqn.hello.spring.boot.dao.SmbmsUserMapper;
import cn.bdqn.hello.spring.boot.entity.SmbmsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
/*读取yml文件的配置*/
@SpringBootTest(classes = HelloSpringBootApplication.class)
@Transactional
@Rollback
public class HelloSpringBootApplicationTests {
@Autowired
private SmbmsUserMapper userMapper;
   @Test
    public void selectTest(){
     List<SmbmsUser> user= userMapper.selectAll();
     for (SmbmsUser u:user){
         System.out.println(u.getUsername());
     }

   }

}
