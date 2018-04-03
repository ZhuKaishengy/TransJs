#### springboot demo项目整合jsp，静态资源访问，打war包
1. 在springboot启动类App中 extends SpringBootServletInitializer
2. pom中dependences
```xml
<dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <exclusions>
        <exclusion>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    <!-- 添加jsp支持 -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.apache.tomcat.embed</groupId>
      <artifactId>tomcat-embed-jasper</artifactId>
      <scope>provided</scope>
    </dependency>

    <!-- 引入servlet依赖. -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <scope>provided</scope>
    </dependency>
    <!-- 引入servlet-jstl依赖. -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
    </dependency>

    <!--SpringBoot默认不支持JSP，需要在项目中添加相关的依赖-->
    <dependency>
      <groupId>org.apache.tomcat.embed</groupId>
      <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
  </dependencies>
  ```
3. 在pom中plugins，其中warName为打包后的项目名，即项目访问的根路径

```xml
<packaging>war</packaging>
```
  ```xml
  <plugins>
  <!--打包-->
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-war-plugin</artifactId>
          <configuration>
            <warName>transJs</warName>
          </configuration>
        </plugin>
  
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <configuration>
            <source>1.8</source>
            <target>1.8</target>
          </configuration>
        </plugin>
        <!-- springboot maven plugin :使用maven build（spring-boot:run）启动springboot的springApplication  -->
        <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
      </plugins>
  ```
4. application.yml中
```yaml
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp
```
5. 静态资源文件放在resources下的static文件夹中，访问路径中没有static
```
    eg：
localhost:8080/jquery-1.10.2.min.js
```
6. 页面中使用el表达式需注意web-app的版本或在jsp中加入
```yaml
isELIgnored="false"
```
7. controller中的接口返回jsp页面，通过设置consumes指定接收参数类型，produces指定返回值类型，
若consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE，在方法参数中加入对象接受
在方法参数中加入Map<String,Object> map承载返回参数！