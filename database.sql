CREATE TABLE `sys_task`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `job_name` varchar(255) DEFAULT NULL COMMENT '任务名',
    `description` varchar(255) DEFAULT NULL COMMENT '任务描述',
    `cron_expression` varchar(255) DEFAULT NULL COMMENT 'cron表达式',
    `bean_class` varchar(255) DEFAULT NULL COMMENT '任务执行时调用哪个类的方法 包名+类名',
    `job_status` varchar(255) DEFAULT NULL COMMENT '任务状态',
    `job_group` varchar(255) DEFAULT NULL COMMENT '任务分组',
    `create_user` varchar(64) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_user` varchar(64) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间'
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


create table user(
    id int(11) not null AUTO_INCREMENT PRIMARY KEY,
    name varchar(30) comment '姓名',
    age int(3) comment '年龄'
)ENGINE=InnoDB  AUTO_INCREMENT=1,DEFAULT CHARSET=utf8;


alter table user alter column id drop default;






insert into user (id,name,age) values (5,'zhangsan',21);
commit;


select * from user;