package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"Controller"})
//@ComponentScan("com.bong.myPackage")
//@ComponentScan(basePackages={"com.firstpackage","com.secondpackage"})
//@ComponentScan({"com.my.package.first","com.my.package.second"})
public class SpringBootServer
{
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServer.class, args);
    }
}
