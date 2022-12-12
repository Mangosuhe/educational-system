# 教务系统

#### 介绍
这是一个由SSM框架搭建的教务系统平台。

#### 本地搭建环境
InteliJ IDEA、jdk1.8、tomcat8.5.29、mysql8.0.28

#### 项目结构
~~~~
├── src/main
│   ├── java/com/javen
│   ├── ├── controller
│   ├── ├── dao
│   ├── ├── model
│   ├── ├── service
│   ├── ├──├── impl
│   ├── resources
│   ├── ├──mapping                    // mybatis映射文件
│   ├── ├──sql                        //数据库文件
│   ├── ├──jdbc.properties            //数据库配置文件
│   ├── ├──log4j.properties           //日志配置文件
│   ├── ├──mybatis-config.xml         //mybatis配置文件
│   ├── ├──spring-mvc.xml             //springmvc配置文件
│   ├── ├──spring-mybatis.xml         //spring配置文件
│   ├── webapp
├── pom.xml
~~~~
#### 安装教程

1. 下载项目并导入依赖；
2. 安装环境：InteliJ IDEA、jdk1.8、tomcat8.5.29、mysql8.0.28；
3. 添加数据库（数据库文件在src/main/resources/sql目录下），在jdbc.properties中修改数据库连接信息；
4. 添加Tomcat启动（需配置工件）。