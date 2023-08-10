## link
https://juejin.cn/post/6857406008877121550

## newcar
手动实现 解耦


## newcar2
手动注入


## newcar3 
自动注入

## newcar4
字段注入

## newcar5
xml 配置

## framework1
bean注入

## framework2
bean注入： 构造函数注入，并赋值

## framwwork3 
尝试（失败）

## framework4
bean 生命周期

##** com.zq.study.framework5 **
1
set注入 
和构造函数注入

####  xml文件构造函数用bean注入
2 
 three中 之前对对象都用ref 

`  <bean id="InjectwithSetter" class="com.zq.study.framework5.two.Vehicle">
     <property name="engine" ref="ToyotaBean">
     </property>
     <property name="tyre" ref="tyre1Bean">
     </property>
     </bean>
 `

新的写法：<p>

`<bean class="com.zq.study.framework5.three.MathCheat"></bean>`
 
 3  four 使用map进行set注入
 
 4 5-9 map对象 set注入
 
 5 5-11 注解
 
 6 5-12 annotation-config注解   自动激活
 
 自动激活，不需要写property了
 
 

