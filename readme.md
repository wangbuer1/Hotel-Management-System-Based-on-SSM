# 基于SSM的酒店管理系统3

## 1、项目介绍

基于SSM的酒店管理系统3拥有两种角色，分别为用户和管理员，具体功能如下：

用户：条件查询房间信息、预订房间、个人中心、查看订单，修改个人信息与密码等

管理员：用户管理、楼层管理、房型管理、客户管理、预订管理、入住管理、营业统计等


## 2、项目技术

后端框架：SSM（Spring、SpringMVC、Mybatis）

前端框架：easyui、jsp、css、JavaScript、JQuery

## 3、开发环境

- JAVA版本：JDK1.8，其它版本理论上可以

- IDE类型：IDEA、Eclipse、Myeclipse都可以。推荐IDEA与Eclipse

- tomcat版本：Tomcat 7.x、8.x、9.x、10.x版本均可

- 数据库版本：MySql 5.x

- 硬件环境：Windows 或者 Mac OS


## 4、功能介绍

### 4.1 登录

![用户登录](https://www.codeshop.fun/Typora-Images/20220511102214.jpg)

![管理员登录](https://www.codeshop.fun/Typora-Images/20220511102220.jpg)

上图分别为用户和管理员的登录界面，均需要输入正确的验证码才能登录至系统，在用户登录界面下方点击“登录后台”按钮就可跳转到管理员登录界面

### 4.2 用户模块

![首页信息](https://www.codeshop.fun/Typora-Images/20220511102357.jpg)

![客户预订界面](https://www.codeshop.fun/Typora-Images/20220511102404.jpg)

![用户中心](https://www.codeshop.fun/Typora-Images/20220511102408.jpg)

查看房间：在首页中，用户可以依据关键字模糊查询房间信息，并能够查看房间详情

预订房间：用户可以网上预订酒店房间。在预订界面，用户需要输入入住时间和离店时间，以及其它必要信息

个人中心：用户可以在个人中心查看订单历史记录、个人资料以及修改个人信息等

### 4.3 管理员模块

![管理员-用户管理](https://www.codeshop.fun/Typora-Images/20220511102757.jpg)

![管理员-楼层管理](https://www.codeshop.fun/Typora-Images/20220511102902.jpg)

![管理员-房型管理](https://www.codeshop.fun/Typora-Images/20220511102926.jpg)

![管理员-预订管理](https://www.codeshop.fun/Typora-Images/20220511103055.jpg)

![管理员-入住管理](https://www.codeshop.fun/Typora-Images/20220511103156.jpg)

![管理员-营业统计](https://www.codeshop.fun/Typora-Images/20220511103241.jpg)

用户管理：管理员可以对用户进行增删改查操作，同时可以依据用户名、角色类型、性别多条件查询用户信息详情

楼层管理：管理员可以对楼层进行增删改查操作，同时可以依据楼层名称筛选楼层信息

房型管理：管理员可以对房型进行增删改查操作，同时可以依据类型名称、状态筛选房型信息

客户管理：管理员可以对客户进行增删改查操作，同时可以依据姓名、身份证号、手机号等信息筛选客户

预订管理：管理员可以对预订户进行新增和编辑操作，同时可以依据姓名、手机号、房型筛选预订信息

入住管理：管理员可以对入住进行登记入住、编辑入住、登记退房操作，同时可以进行多条件查询

营业统计：管理员可以根据按月、按日统计营业额

### 4.4文档目录

![文档目录](https://www.codeshop.fun/Typora-Images/202208142011885.jpg)



## 6、获取方式

关注公众号： **程序员王不二**，回复 “酒店3 ” ，即可免费获取完整版的项目代码。

 ![](https://www.codeshop.fun/Typora-Images/202205281253739.png)

  

