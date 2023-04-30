# java springboot project
This a demo to show how to start a springboot project.
You should modify the idea to make it better to work with
* ideaexe.64.vmoptions
```
-Xms1024m
-Xmx2048m
-XX:ReservedCodeCacheSize=512m
-XX:+IgnoreUnrecognizedVMOptions
-XX:+UseG1GC
-XX:SoftRefLRUPolicyMSPerMB=50
-XX:CICompilerCount=2
-XX:+HeapDumpOnOutOfMemoryError
-XX:-OmitStackTraceInFastThrow
-ea
-Dsun.io.useCanonCaches=false
-Djdk.http.auth.tunneling.disabledSchemes=""
-Djdk.attach.allowAttachSelf=true
-Djdk.module.illegalAccess.silent=true
-Dkotlinx.coroutines.debug=off

```
* maven repository
```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                          https://maven.apache.org/xsd/settings-1.0.0.xsd">

      <mirrors>
        <mirror>  
            <id>alimaven</id>  
            <name>aliyun maven</name>  
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
            <mirrorOf>central</mirrorOf>          
        </mirror>  
      </mirrors>
</settings>
```
# maven dependency
msyql
# application.properities
You need to specify the database driver: com.mysql.cj.jdbc.Driver
# controller parameter
you must use the small camel case to set the vo class and parameter in postman, springboot can automatic convert json to
vo if you do this.
# pojo in mybatis

You should change the setting to make mybatis support pojo to xml
# selectKey in mybatis
you can use the selectKey to make the atomistic operation in user id generation
# permission control
