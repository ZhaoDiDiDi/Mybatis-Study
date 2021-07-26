+ **SqlSessionFactoryBuilder(构造器)**:它会根据配置或者代码来生成SqlSessionFactory,采用的是分步构建的Builder模式。

+ **SqlSessionFactory(工厂接口)**：依靠它来生成SqlSession，使用的是工厂模式

+ **SqlSession(会话)**：一个既可以发生SQL执行返回结果，也可以获取Mapper的接口。在现有的技术中，一般我们会让其在业务罗技代码中“消失”，而使用的是MyBatis提供的SQLMapper接口编程结束，它能提高代码的可读性和维护性。

+ **SQL Mapper(映射器)**：MyBatis新设计存在的组件，它有由一个Java接口和XML文件(或注解)构成，需要给出对应的SQL和映射规则。它负责发送SQL去执行，并返回结果。
