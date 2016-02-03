CREATE TABLE `contact` (
  `id` int(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) NOT NULL COMMENT 'name',
  `mobile` varchar(20) DEFAULT NULL COMMENT 'mobile number',
  `email` varchar(100) DEFAULT NULL COMMENT 'email',
  `vpmn` varchar(100) DEFAULT NULL,
  `office_address` varchar(255) DEFAULT NULL,
  `home_address` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `job` varchar(100) DEFAULT NULL,
  `job_level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='课程表';

CREATE TABLE `department` (
  `id` int(19) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) NOT NULL COMMENT 'name',
  `memo` varchar(255) DEFAULT NULL COMMENT 'description',
  `parent` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='班级表';


mysql> SET character_set_client='gbk';

mysql> SET character_set_connection='gbk'

mysql> SET character_set_results='gbk'