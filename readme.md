##连接数据库报错原

    does not chain with any of the trust anchors
     
    应该是证书问题，把useSSL=true改为useSSL=false就好了。
    
    Wed Aug 22 22:20:33 CST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
    
    在设置连接数据源时候！设置改为这个！
    
    spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb?useUnicode=true&characterEncoding=utf8&useSSL=true
    
##配置监控
  
   1.添加依赖
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>  