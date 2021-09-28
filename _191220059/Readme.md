
# W02
**191220059 林龙杰**
##任务一
**1. 用plantuml画出example的类图与Scene中main方法执行过程中的对象时序图；**
    解决：类图见uml文件夹中'classdiagram1.pu'。时序图见'timeline1.pu'
**2. 尝试从面向对象编程角度理解`example`的设计理念，具体阐述这样写的好处与可改进之处（越详细越好）；**
    解答：我在觉得，老师给的样例的写法，有很多优点。1.首先是面向对象编程，所以在构建场景和角色的时候非常脉络清晰，队列，老爷爷，葫芦娃，分类器，分类方法，概念都很清晰。2.用到了两个接口，Linable和Sorter使得代码的耦合度降低了很多，比如Sorter可以装载许多种分类算法，但想要修改或者增加只需要修改或者增加分类算法类就可以了。而Linable，因为排队的可以是葫芦娃也可以是妖精，还可以是其他，但只要是能排队的东西只要实现了Linable接口，就可以进行排队，这样写代码实现了多态，使得代码的维护性和拓展性提高了。
##任务二
**参考示例代码，设计自己的类型并完成“蛇精指挥256个小妖怪站成一队“的场景。要求在`Readme.md`中画出相应类图，并添加可视化结果展示链接。**
    解决：类图见uml文件夹中'classdiagram2.pu'。时序图见'timeline2.pu'
    运行过程bilibili录屏：
    final version:
    https://www.bilibili.com/video/BV1PU4y1P7Mf?share_source=copy_web
    init version:
    https://www.bilibili.com/video/BV1RP4y1h7ep?share_source=copy_web
##任务三
**将上一任务中自己写的代码，改为“蛇精指挥256个小妖怪站成一个16x16方阵“的场景。要求在`Readme.md`中画出相应类图，并添加可视化结果展示链接。**
    解决：类图见uml文件夹中'classdiagram2.pu'。时序图见'timeline2.pu'
    运行过程bilibili录屏：
    final version:
    https://www.bilibili.com/video/BV1PU4y1P7Mf?share_source=copy_web
    init:
    https://www.bilibili.com/video/BV1VQ4y1C7jd?share_source=copy_web

