# 安装

## Maven

添加 Maven 依赖，直接开始 Groovy 编程，@see [Java 整合 Groovy]({{< relref "/docs/Action/Java-Integrate-Groovy.md" >}})

```xml
<dependency>
  <groupId>org.codehaus.groovy</groupId>
  <artifactId>groovy-all</artifactId>
  <version>${groovy.version}</version>
</dependency>
```



## Local

```bash
$ wget https://dl.bintray.com/groovy/maven/apache-groovy-binary-3.0.4.zip

$ unzip apache-groovy-binary-3.0.4.zip

# 配置环境变量
$ vim /etc/profile
export GROOVY_HOME=/Users/kail/java/groovy-3.0.4
export PATH="$PATH:$GROOVY_HOME/bin"

# 查看版本
$ groovy --version
Groovy Version: 3.0.4 JVM: 1.8.0_151 Vendor: Oracle Corporation OS: Mac OS X

#
# groovysh
$ groovysh
Groovy Shell (3.0.4, JVM: 1.8.0_151)
Type ':help' or ':h' for help.
------------------------------------------
groovy:000> :x # 退出

#
# 打开 Groovy Swing 交互界面
$ groovyConsole
```





## 系统要求

> System requirements : http://www.groovy-lang.org/download.html#requirements
>
> InvokeDynamic (indy) support: https://docs.groovy-lang.org/latest/html/documentation/invokedynamic-support.html

| Groovy            | JVM Required (non-indy) | JVM Required (indy) * |
| :---------------- | :---------------------- | :-------------------- |
| **4.0 - current** | N/A                     | 1.8+                  |
| **3.x**           | 1.8+                    | 1.8+                  |
| **2.5 - 2.6**     | 1.7+                    | 1.7+                  |
| **2.3 - 2.4**     | 1.6+                    | 1.7+                  |
| **2.0 - 2.2**     | 1.5+                    | 1.7+                  |
| **1.6 - 1.8**     | 1.5+                    | N/A                   |
| **1.5**           | 1.4+                    | N/A                   |
| **1.0**           | 1.4-1.7                 | N/A                   |



## Read More

- [Apache Groovy Download](http://www.groovy-lang.org/download.html)
- [Install Groovy](http://www.groovy-lang.org/install.html)