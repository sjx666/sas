package cn.bdqn.hello.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
/*扫描dao层下的所有接口*/
@MapperScan(basePackages = "cn.bdqn.hello.spring.boot.dao")
@SpringBootApplication
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
