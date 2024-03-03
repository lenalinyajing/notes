1、修改表名
    alter table 表名 rename as 新表名
    修改表字段
    alter table 表名 modify age VARCHAR(11)——修改约束
    alter table 表名 change age age1 int(1) ——字段重命名
    删除表字段 
    alter table 表名 drop 字段
    alter table teacher drop age
    删除表
    drop table if exists teacher;
 !!!!!所有的创建和删除都加上判断
2、注意
    `` 字段名，使用这个包裹
    sql关键字大小写不敏感，建议都小写
    所有符号都用英文
3、insert
    insert into 表名（[字段1，字段2，字段2]）values ('值1','值2','值3')；
    注：字段和字段之间使用英文逗号隔开
        字段是可以省略的，但后面的值要一一对应
        可以同时插入多条数据，value后面的值，需要使用，隔开即可,values(),(),,,
4、update
    update 表名 set column_name = value,[column2=value2] [where 条件]
    注：column_name是数据库的列，尽量带上
        条件，筛选的条件，如果没有指定，则会修改所有的列
        value,可是一个具体的值，也可是一个变量
        多个设置属性之间，使用英文逗号隔开
5、truncate命令
    作用：完全清空一个数据表，表的结构和索引约束不会变
    truncate `student`
6、delete
    和truncate区别
    相同点：都能删除数据，都不会删除表结构
    不同： 
        truncate  重新设置 自增列  计数器会归零  不会影响事务
    
7、select
    select 字段 from 表
        [left | right | inner join table_name2]  ---联合查询
        [where ...]  --指定结果需满足的条件
        [group by ..] --指定按哪个字段分组
        [having ..]    --过滤分组的记录必须满足的必要条件
        [order by ..]  --指定查询记录按一个或多个条件排序
        [limit offset,row_count] --查询条数
8、distinct
    去除select查询出来的结果中重复的数据，重复的数据只显示一条
9、连表查询
    left join  如果表中至少有一个匹配，就返回行
    inner join
    right join
10、自连接
    自己的表和自己的表连接，核心：一张表拆成两张一样的表
11 排序 分页
    order by  desc/asc  limit 当前页，页面的大小
12 聚合函数
    sum()、AVG()  MAX()   MIN()
    count()
        count(列)   count（字段）  会忽略所有的null值
        count(*)    不会忽略null值，本质 计算行数
        count(1)    不会忽略null值  本质 计算行数
13 事务
    原则 ACID  
    原子性，
    一致性，
    隔离性，
    持久性
14 索引
    索引是帮助mysql高效获取数据的数据结构
    分类：主键索引   主键不可重复，只能有一个列作为主键
         唯一索引   避免重复的列出现，唯一索引可以重复，多个列都可以表示为唯一索引
         常规索引
         全文索引
    索引原则
        索引不是越多越好
        不要堆经常变动数据加索引
        小数据量的表不需要加索引
        索引一般加在常用来查询的字段上
15 三大范式
    第一范式：原子性：保证不可分
    第二范式：前提：满足第一范式  每张表只描述一件事情
    第三范式：需要确保数据表中每一列数据都和主键直接相关，而不是间接相关
16  JDBC
(1)加载驱动
（2）连接数据库DriverManager
（3）获取执行sql的对象Statement
（4）获取返回的结果集
（5）释放连接
17 PreparedStatement对象
可以防止sql注入，效率更好
