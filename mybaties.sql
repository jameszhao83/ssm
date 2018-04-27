/*
 Navicat MySQL Data Transfer

 Source Server         : mysqllocal
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : mybaties

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 27/04/2018 15:47:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ctable
-- ----------------------------
DROP TABLE IF EXISTS `ctable`;
CREATE TABLE `ctable` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tablename` varchar(50) DEFAULT NULL COMMENT '表名',
  `tabledesc` varchar(1000) DEFAULT NULL COMMENT '表描述',
  `cman` int(10) DEFAULT NULL COMMENT '创建人',
  `tablenamec` varchar(50) DEFAULT NULL COMMENT '中文表名',
  PRIMARY KEY (`id`),
  KEY `cman` (`cman`),
  CONSTRAINT `ctable_ibfk_1` FOREIGN KEY (`cman`) REFERENCES `person` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ctable
-- ----------------------------
BEGIN;
INSERT INTO `ctable` VALUES (1, 'ctable', '存储创建表', 1, '表名表');
INSERT INTO `ctable` VALUES (2, 'dictfiled', '表字段', 1, '字段名表');
INSERT INTO `ctable` VALUES (3, 'test test test', 'test test test', NULL, NULL);
INSERT INTO `ctable` VALUES (4, 'test', 'test test test', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for dictfiled
-- ----------------------------
DROP TABLE IF EXISTS `dictfiled`;
CREATE TABLE `dictfiled` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `table` int(11) DEFAULT NULL COMMENT '表名',
  `tableFiled` varchar(50) DEFAULT NULL COMMENT '字段名',
  `tablefileddesc` varchar(100) DEFAULT NULL COMMENT '字段描述',
  `tablefiledtype` varchar(100) DEFAULT NULL COMMENT '字段类型',
  PRIMARY KEY (`id`),
  KEY `table` (`table`),
  CONSTRAINT `dictfiled_ibfk_1` FOREIGN KEY (`table`) REFERENCES `ctable` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictfiled
-- ----------------------------
BEGIN;
INSERT INTO `dictfiled` VALUES (1, 1, 'tablename', '表名', 'varchar');
INSERT INTO `dictfiled` VALUES (2, 1, 'tabledesc', '表描述', 'varchar');
INSERT INTO `dictfiled` VALUES (3, 1, 'cman', '创建人', '外键');
INSERT INTO `dictfiled` VALUES (4, 1, 'tablenamec', '中文表名', 'varchar');
COMMIT;

-- ----------------------------
-- Table structure for inspection
-- ----------------------------
DROP TABLE IF EXISTS `inspection`;
CREATE TABLE `inspection` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `INSPECTIONID` varchar(20) DEFAULT NULL COMMENT '巡检编号',
  `INSPECTIONCONTEXT` varchar(50) NOT NULL COMMENT '巡检内容',
  `INSPECTIONCYCLE` varchar(100) NOT NULL COMMENT '巡检周期',
  `INSPECTIONCYCLEMAN` int(50) DEFAULT NULL COMMENT '巡检人',
  `COMMENT` varchar(200) DEFAULT NULL COMMENT '备注',
  `INSPECTIONWATCHMAN` int(10) DEFAULT NULL COMMENT '监护人',
  `INSPECTIONSUPPORTMAN` varchar(50) DEFAULT NULL COMMENT '支撑人员',
  `MONDAY` tinyint(1) DEFAULT NULL COMMENT '星期一',
  `TUESDAY` tinyint(1) DEFAULT NULL COMMENT '星期二',
  `THURSDAY` tinyint(1) DEFAULT NULL COMMENT '星期四',
  `WENNESDAY` tinyint(1) DEFAULT NULL COMMENT '星期三',
  `FIRDAY` tinyint(1) DEFAULT NULL COMMENT '星期五',
  `SATURDAY` tinyint(1) DEFAULT NULL COMMENT '星期六',
  `SUNDAY` tinyint(1) DEFAULT NULL COMMENT '星期日',
  `INSPECTIONSYSTEMID` int(10) DEFAULT NULL COMMENT '巡检系统id',
  PRIMARY KEY (`ID`),
  KEY `INSPECTIONCYCLEMAN` (`INSPECTIONCYCLEMAN`),
  KEY `INSPECTIONWATCHMAN` (`INSPECTIONWATCHMAN`),
  KEY `INSPECTIONSYSTEMID` (`INSPECTIONSYSTEMID`),
  CONSTRAINT `INSPECTION_ibfk_1` FOREIGN KEY (`INSPECTIONCYCLEMAN`) REFERENCES `person` (`ID`),
  CONSTRAINT `INSPECTION_ibfk_2` FOREIGN KEY (`INSPECTIONWATCHMAN`) REFERENCES `person` (`ID`),
  CONSTRAINT `INSPECTION_ibfk_3` FOREIGN KEY (`INSPECTIONSYSTEMID`) REFERENCES `systeminfo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for memuleft
-- ----------------------------
DROP TABLE IF EXISTS `memuleft`;
CREATE TABLE `memuleft` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `nodeName` varchar(20) NOT NULL,
  `nodeUrl` varchar(20) DEFAULT NULL,
  `isleat` tinyint(1) DEFAULT NULL,
  `parentId` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of memuleft
-- ----------------------------
BEGIN;
INSERT INTO `memuleft` VALUES (1, '检修管理', '', 1, NULL);
INSERT INTO `memuleft` VALUES (2, '巡检管理', '', 1, NULL);
INSERT INTO `memuleft` VALUES (3, '人员管理', '', 1, NULL);
INSERT INTO `memuleft` VALUES (4, '权限管理', NULL, 1, NULL);
INSERT INTO `memuleft` VALUES (5, '菜单管理', NULL, 0, NULL);
INSERT INTO `memuleft` VALUES (6, '数据字典', NULL, 1, NULL);
COMMIT;

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `permissionsname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PNAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `PTYPE` varchar(50) DEFAULT NULL COMMENT '用户类型',
  `PCOMP` varchar(200) DEFAULT NULL COMMENT '用户单位',
  `USERNAME` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `PASSWORD` varchar(50) DEFAULT NULL COMMENT '密码',
  `SCOPE` varchar(200) DEFAULT NULL COMMENT '工作职责',
  `ENTRYTIME` date DEFAULT NULL COMMENT '入职时间',
  `LEAVETIME` date DEFAULT NULL COMMENT '离职时间',
  `PROJECTNAME` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `OFFICEADDRESS` varchar(200) DEFAULT NULL COMMENT '办公地点',
  `TEMINALIP` varchar(30) DEFAULT NULL COMMENT '终端IP',
  `SERVICEDEP` varchar(30) DEFAULT NULL COMMENT '服务部门',
  `PHONE` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `TELEPHONE` varchar(20) DEFAULT NULL COMMENT '座机',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9739 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
BEGIN;
INSERT INTO `person` VALUES (1, '赵宏广', '外委', '安徽继远软件', 'zhaohongguang', 'nx123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `person` VALUES (9460, '吴艳艳', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司安监管理一体化平台系统运维', '本部702', '10.216.51.135', '安质部', NULL, NULL);
INSERT INTO `person` VALUES (9461, '马国伏', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司电子文件、非结构化数据平台运维服务项目', '设计院324', '10.216.71.169', '办公室', NULL, NULL);
INSERT INTO `person` VALUES (9462, '妥霖', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司电子文件、非结构化数据平台运维服务项目', '设计院324', '10.216.71.167', '办公室', NULL, NULL);
INSERT INTO `person` VALUES (9463, '杜芬君', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司协同办公及数字档案馆系统运维', '本部辅楼207', '10.216.16.120', '办公室', NULL, NULL);
INSERT INTO `person` VALUES (9464, '段力薇', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司协同办公及数字档案馆系统运维', '本部1605', '10.216.17.158', '办公室', NULL, NULL);
INSERT INTO `person` VALUES (9465, '马维奇', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司协同办公及数字档案馆系统运维', '呼叫中心', '10.216.30.149', '办公室', NULL, NULL);
INSERT INTO `person` VALUES (9466, '李小虎', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司乡镇供电所及班组一体化、员工报销及凭证协同运维服务项目', '呼叫中心', '10.216.30.200', '财务部', NULL, NULL);
INSERT INTO `person` VALUES (9467, '张文博', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司乡镇供电所及班组一体化、员工报销及凭证协同运维服务项目', '呼叫中心', '10.216.30.160', '', NULL, NULL);
INSERT INTO `person` VALUES (9468, '张琪', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.71.133', '财务部', NULL, NULL);
INSERT INTO `person` VALUES (9469, '黄巧慧', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.71.140', '', NULL, NULL);
INSERT INTO `person` VALUES (9470, '刘军', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.71.142', '', NULL, NULL);
INSERT INTO `person` VALUES (9471, '苏佳欢', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.71.141', '', NULL, NULL);
INSERT INTO `person` VALUES (9472, '尹辉', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.71.137', '', NULL, NULL);
INSERT INTO `person` VALUES (9473, '赵伟', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '设计院406', '10.216.30.139', '', NULL, NULL);
INSERT INTO `person` VALUES (9474, '丁金润', '外委', '远光软件股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司财务管控运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9475, '张若琪', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司业务凭据电子化信息化运维服务', '设计院420', '10.216.71.83', '财务部', NULL, NULL);
INSERT INTO `person` VALUES (9476, '陶俊杰', '外委', '福建亿榕信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司统一项目储备库管理系统二线运维服务', '设计院324', '10.216.71.164', '财务部', NULL, NULL);
INSERT INTO `person` VALUES (9477, '苗保春', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司一体化电网规划设计平台运维服务', '本部1403', '10.216.53.122', '发策部', NULL, NULL);
INSERT INTO `person` VALUES (9478, '田小燕', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司规划计划信息管理系统（综合计划、生产计划、生产零购、生产统计、农网统计、投资统计、节能减排、一库三中心）运维服务', '设计院401', '10.216.71.130', '发策部', NULL, NULL);
INSERT INTO `person` VALUES (9479, '刘鹏', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司规划计划信息管理系统（综合计划、生产计划、生产零购、生产统计、农网统计、投资统计、节能减排、一库三中心）运维服务', '设计院401', '10.216.71.131', '', NULL, NULL);
INSERT INTO `person` VALUES (9480, '王志轩', '外委', '北京京杭天丽科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司规划计划信息管理系统（电网规划、电网前期、基建项目储备库、投资计划、电源接入、新能源、公司规划、投资统计）运维服务', '本部421', '10.216.71.106', '发策部', NULL, NULL);
INSERT INTO `person` VALUES (9481, '宋孟韬', '外委', '北京京杭天丽科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司规划计划信息管理系统（电网规划、电网前期、基建项目储备库、投资计划、电源接入、新能源、公司规划、投资统计）运维服务', '本部1409', '10.216.71.105', '', NULL, NULL);
INSERT INTO `person` VALUES (9482, '高琦', '外委', '北京京杭天丽科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司规划计划信息管理系统（电网规划、电网前期、基建项目储备库、投资计划、电源接入、新能源、公司规划、投资统计）运维服务', '本部1409', '10.216.53.86', '', NULL, NULL);
INSERT INTO `person` VALUES (9483, '司晶', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司基建管控运维服务', '设计院320', '10.216.71.181', '建设部', NULL, NULL);
INSERT INTO `person` VALUES (9484, '李春晓', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司基建管控运维服务', '设计院320', '10.216.71.100', '', NULL, NULL);
INSERT INTO `person` VALUES (9485, '田琳', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司基建管控运维服务', '设计院320', '10.216.71.182', '', NULL, NULL);
INSERT INTO `person` VALUES (9486, '李鹏飞', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司基建管控运维服务', '设计院320', '10.216.71.179', '', NULL, NULL);
INSERT INTO `person` VALUES (9487, '虎学林', '外委', '北京科东电力控制系统有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司全国统一电力市场技术支撑平台运维服务项目', '本部309', '10.216.28.46', '交易中心', NULL, NULL);
INSERT INTO `person` VALUES (9488, '梁红芳', '外委', '北京科东电力控制系统有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司全国统一电力市场技术支撑平台运维服务项目', '本部309', '10.216.28.41', '', NULL, NULL);
INSERT INTO `person` VALUES (9489, '赵梦娇', '外委', '北京科东电力控制系统有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司全国统一电力市场技术支撑平台运维服务项目', '本部309', '10.216.28.39', '', NULL, NULL);
INSERT INTO `person` VALUES (9490, '乔瑜瑜', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院500', '10.216.71.38', '科信部', NULL, NULL);
INSERT INTO `person` VALUES (9491, '苏丹', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '本部1215', '10.216.52.126', '', NULL, NULL);
INSERT INTO `person` VALUES (9492, '常坤', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '本部1212', '10.216.52.236', '', NULL, NULL);
INSERT INTO `person` VALUES (9493, '龚毅', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '本部1212', '10.216.52.228', '', NULL, NULL);
INSERT INTO `person` VALUES (9494, '吕康', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院500', '10.216.71.224', '', NULL, NULL);
INSERT INTO `person` VALUES (9495, '张书博', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院500', '10.216.71.150', '', NULL, NULL);
INSERT INTO `person` VALUES (9496, '魏丹丹', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院500', '10.216.71.228', '', NULL, NULL);
INSERT INTO `person` VALUES (9497, '赵宏广', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院312', '10.216.71.153', '', NULL, NULL);
INSERT INTO `person` VALUES (9498, '郑洋洋', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '信通503', '10.216.44.147', '', NULL, NULL);
INSERT INTO `person` VALUES (9499, '薛蓉', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院315', '10.216.71.102', '', NULL, NULL);
INSERT INTO `person` VALUES (9500, '曹兴琛', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '信通503', '10.216.44.146', '', NULL, NULL);
INSERT INTO `person` VALUES (9501, '黄瑷珲', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统技术支撑及性能调优运维服务项目', '设计院315', '10.216.71.152', '', NULL, NULL);
INSERT INTO `person` VALUES (9502, '邹菊', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司网络大学及“五位一体”协同平台ARIS系统运维服务', '呼叫中心', '10.216.30.188', '人资部', NULL, NULL);
INSERT INTO `person` VALUES (9503, '顾家仪', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司人资管控运维服务', '设计院403', '10.216.71.121', '人资部', NULL, NULL);
INSERT INTO `person` VALUES (9504, '李莎', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司人资管控运维服务', '呼叫中心', '10.216.30.163', '', NULL, NULL);
INSERT INTO `person` VALUES (9505, '王梓楠', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP业务审计系统运维服务', '本部1013', '10.216.52.112', '审计部', NULL, NULL);
INSERT INTO `person` VALUES (9506, '方通学', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司物资管理运维服务项目', '设计院416', '10.216.71.77', '物资部', NULL, NULL);
INSERT INTO `person` VALUES (9507, '周辉', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司物资管理运维服务项目', '设计院410', '10.216.71.68', '', NULL, NULL);
INSERT INTO `person` VALUES (9508, '连赢', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司计量资产全寿命系统运维服务', '计量中心13412', '10.216.33.30', '营销部', NULL, NULL);
INSERT INTO `person` VALUES (9509, '马莲', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销分析与辅助决策系统运维服务项目', '设计院518', '10.216.71.229', '营销部', NULL, NULL);
INSERT INTO `person` VALUES (9510, '郭旭', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销分析与辅助决策系统运维服务项目', '设计院525', '10.216.71.226', '', NULL, NULL);
INSERT INTO `person` VALUES (9511, '柳世雄', '外委', '北京科东电力控制系统有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司一体化缴费平台（主站）系统运维服务项目', '设计院505', '10.216.71.62', '营销部', NULL, NULL);
INSERT INTO `person` VALUES (9512, '庄娜', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '呼叫中心', '10.216.30.161', '营销部', NULL, NULL);
INSERT INTO `person` VALUES (9513, '于啸天', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院521', '10.216.71.124', '', NULL, NULL);
INSERT INTO `person` VALUES (9514, '黄雪刚', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院503', '10.216.71.107', '', NULL, NULL);
INSERT INTO `person` VALUES (9515, '李艳琴', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院508', '10.316.71.242', '', NULL, NULL);
INSERT INTO `person` VALUES (9516, '尤小龙', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '暂未确定', '10.216.32.161', '', NULL, NULL);
INSERT INTO `person` VALUES (9517, '麻小平', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院522', '10.216.71.162', '', NULL, NULL);
INSERT INTO `person` VALUES (9518, '马宏波', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院521', '10.216.71.129', '', NULL, NULL);
INSERT INTO `person` VALUES (9519, '田瑞', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院508', '10.216.71.126', '', NULL, NULL);
INSERT INTO `person` VALUES (9520, '焦汉东', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院521', '10.216.71.242', '', NULL, NULL);
INSERT INTO `person` VALUES (9521, '李军', '外委', '深圳市国电科技通信有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司用电信息采集、电动汽车、电能服务管理平台运维服务项目', '设计院503', '10.216.71.125', '', NULL, NULL);
INSERT INTO `person` VALUES (9522, '陈志雄', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '呼叫中心', '10.216.30.164', '营销部', NULL, NULL);
INSERT INTO `person` VALUES (9523, '王凤娇', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '呼叫中心', '10.216.30.158', '', NULL, NULL);
INSERT INTO `person` VALUES (9524, '杜金武', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院527', '10.216.71.225', '', NULL, NULL);
INSERT INTO `person` VALUES (9525, '何万礼', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院527', '10.216.71.238', '', NULL, NULL);
INSERT INTO `person` VALUES (9526, '张攀', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '呼叫中心', '10.216.71.246', '', NULL, NULL);
INSERT INTO `person` VALUES (9527, '胡兴富', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院519', '10.216.71.223', '', NULL, NULL);
INSERT INTO `person` VALUES (9528, '李小云', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院519', '10.216.71.240', '', NULL, NULL);
INSERT INTO `person` VALUES (9529, '李勇', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9530, '任朝', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9531, '毕进元', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '信通公司503', '10.216.1.26', '', NULL, NULL);
INSERT INTO `person` VALUES (9532, '宋剑', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院504', '10.216.71.165', '', NULL, NULL);
INSERT INTO `person` VALUES (9533, '王林', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院518', '10.216.71.213', '', NULL, NULL);
INSERT INTO `person` VALUES (9534, '张军江', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司营销类业务系统运维服务项目', '设计院504', '10.216.71.154', '', NULL, NULL);
INSERT INTO `person` VALUES (9535, '马国武', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2306', '10.216.44.81', '运监中心', NULL, NULL);
INSERT INTO `person` VALUES (9536, '张娜娜', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2306', '10.216.44.82', '', NULL, NULL);
INSERT INTO `person` VALUES (9537, '黄亚萍', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2306', '10.216.44.83', '', NULL, NULL);
INSERT INTO `person` VALUES (9538, '吴佳静', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2306', '10.216.44.92', '', NULL, NULL);
INSERT INTO `person` VALUES (9539, '马龙', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2305', '10.216.44.71', '', NULL, NULL);
INSERT INTO `person` VALUES (9540, '史小宁', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2306', '10.216.44.78', '', NULL, NULL);
INSERT INTO `person` VALUES (9541, '王彩婷', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '本部2305', '10.216.44.93', '', NULL, NULL);
INSERT INTO `person` VALUES (9542, '王会金', '外委', '陕西德通信息科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司运营监测（控）系统运维服务项目', '设计院319', '10.216.71.174', '', NULL, NULL);
INSERT INTO `person` VALUES (9543, '刘思娜', '外委', '天津市普讯电力信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司电网GIS平台、统一车辆管理平台运维服务项目', '呼叫中心', '10.216.30.177', '运检部', NULL, NULL);
INSERT INTO `person` VALUES (9544, '火亮', '外委', '天津市普讯电力信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司电网GIS平台、统一车辆管理平台运维服务项目', '呼叫中心', '10.216.30.168', '', NULL, NULL);
INSERT INTO `person` VALUES (9545, '薛超', '外委', '天津市普讯电力信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司电网GIS平台、统一车辆管理平台运维服务项目', '呼叫中心', '10.216.30.170', '', NULL, NULL);
INSERT INTO `person` VALUES (9546, '郭凯', '外委', '金现代信息产业股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司供电电压自动采集信息系统运维服务项目', '设计院623', '10.216.71.247', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9547, '赵娜', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司经法系统运维服务', '呼叫中心', '10.216.46.27', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9548, '杨涛', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司经法系统运维服务', '呼叫中心', '10.216.30.178', '', NULL, NULL);
INSERT INTO `person` VALUES (9549, '龚丽', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.131', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9550, '李思嘉', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.184', '', NULL, NULL);
INSERT INTO `person` VALUES (9551, '何艳艳', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.187', '', NULL, NULL);
INSERT INTO `person` VALUES (9552, '李梦华', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.136', '', NULL, NULL);
INSERT INTO `person` VALUES (9553, '杨春秋', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.134', '', NULL, NULL);
INSERT INTO `person` VALUES (9554, '孙雨晴', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.159', '', NULL, NULL);
INSERT INTO `person` VALUES (9555, '马雪静', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.71.94', '', NULL, NULL);
INSERT INTO `person` VALUES (9556, '买淑贞', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.135', '', NULL, NULL);
INSERT INTO `person` VALUES (9557, '苏蓉', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.191', '', NULL, NULL);
INSERT INTO `person` VALUES (9558, '胡义蔚', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.130', '', NULL, NULL);
INSERT INTO `person` VALUES (9559, '李夫海', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.129', '', NULL, NULL);
INSERT INTO `person` VALUES (9560, '张薇薇', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.30.157', '', NULL, NULL);
INSERT INTO `person` VALUES (9561, '刘晓琳', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '呼叫中心', '10.216.71.65', '', NULL, NULL);
INSERT INTO `person` VALUES (9562, '马健', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '设计院412', '10.216.71.66', '', NULL, NULL);
INSERT INTO `person` VALUES (9563, '魏建兵', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司ERP运维服务项目', '设计院412', '10.216.71.64', '', NULL, NULL);
INSERT INTO `person` VALUES (9564, '杨竞奋', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司BPM系统运维服务', '设计院504', '10.216.71.14', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9565, '杨洋', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息通信业务管理系统运维服务', '信通317', '10.216.46.23', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9566, '尹鹏', '外委', '', NULL, NULL, NULL, NULL, NULL, '', '信通312', '10.216.71.14', '', NULL, NULL);
INSERT INTO `person` VALUES (9567, '丁贝贝', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司公共数据资源池运维服务项目', '设计院310', '10.216.71.249', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9568, '黄炜', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司桌面终端管理系统运维服务项目', '设计院401', '10.216.71.128', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9569, '伍永喜', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司数据中心运维服务项目', '设计院326', '10.216.71.156', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9570, '张明', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司数据中心运维服务项目', '设计院427', '10.216.71.158', '', NULL, NULL);
INSERT INTO `person` VALUES (9571, '罗彬', '外委', '四川中电启明星信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司统一身份认证及内网企业门户运维服务项目', '呼叫中心', '10.216.30.245', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9572, '曹永平', '外委', '四川中电启明星信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司统一身份认证及内网企业门户运维服务项目', '呼叫中心', '10.216.71.35', '', NULL, NULL);
INSERT INTO `person` VALUES (9573, '许春阳', '外委', '四川中电启明星信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司统一身份认证及内网企业门户运维服务项目', '呼叫中心', '10.216.30.246', '', NULL, NULL);
INSERT INTO `person` VALUES (9574, '李玲燕', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司数据治理运维服务项目', '设计院310', '10.216.71.188', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9575, '胡东坤', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统缺陷消除及隐患治理运维服务', '信通217', '10.216.47.171', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9576, '左启鑫', '外委', '北京中电普华信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司信息系统缺陷消除及隐患治理运维服务', '信通505', '10.216.44.157', '', NULL, NULL);
INSERT INTO `person` VALUES (9577, '刘洋', '外委', '安徽继远软件有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息系统性能监控系统运维服务项目', '', '', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9578, '戚志慧', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司数据交换平台运维服务项目', '信通503', '10.216.44.134', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9579, '张朋', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司数据交换平台运维服务项目', '设计院312', '10.216.46.51', '', NULL, NULL);
INSERT INTO `person` VALUES (9580, '祖合祥', '外委', '四川中电启明星信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司云终端系统运维服务项目', '设计院403', '10.216.71.123', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9581, '高显锋', '外委', '北京银信长远科技股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司灾备系统运维服务项目', '信通505', '10.216.1.9', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9582, '李海涛', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司虚拟机系统运维服务项目', '信通503', '10.216.44.145', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9583, '赵伟', '外委', '国网信通亿力科技有限责任公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司虚拟机系统运维服务项目', '信通504', '10.216.1.41', '', NULL, NULL);
INSERT INTO `person` VALUES (9584, '李万虎', '外委', '河南腾龙信息工程有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司外网网站及呼叫中心运维服务项目', '设计院303', '10.216.71.149', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9585, '马全义', '外委', '北京市天元网络技术股份有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司TMS系统运维服务项目', '设计院322', '10.216.71.204', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9586, '王继伟', '外委', '宁夏电通信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息备用机房运维服务项目', '', '', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9587, '王东升', '外委', '宁夏电通信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息备用机房运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9588, '田凯文', '外委', '宁夏电通信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息备用机房运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9589, '王培强', '外委', '宁夏电通信息技术有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏电力公司信息备用机房运维服务项目', '', '', '', NULL, NULL);
INSERT INTO `person` VALUES (9590, '张国军', '外委', '北京星华永泰科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司网络和安全防护设备三线维保服务项目', '信通220', '10.213.48.18', '信通公司', NULL, NULL);
INSERT INTO `person` VALUES (9591, '孙德平', '外委', '北京星华永泰科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司网络和安全防护设备三线维保服务项目', '设计院419', '10.216.47.25', '', NULL, NULL);
INSERT INTO `person` VALUES (9592, '高阳', '外委', '北京星华永泰科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司网络和安全防护设备三线维保服务项目', '设计院419', '10.216.47.27', '', NULL, NULL);
INSERT INTO `person` VALUES (9593, '葛连松', '外委', '北京星华永泰科技有限公司', NULL, NULL, NULL, NULL, NULL, '国网宁夏信通公司网络和安全防护设备三线维保服务项目', '设计院419', '10.216.47.17', '', NULL, NULL);
INSERT INTO `person` VALUES (9711, '孙寅', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通305', NULL, NULL, 'p13709516598', '4915651.0');
INSERT INTO `person` VALUES (9712, '李斌', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通201', NULL, NULL, 'p18509510812', '4915171.0');
INSERT INTO `person` VALUES (9713, '夏琨', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p13895377446', '4915152.0');
INSERT INTO `person` VALUES (9714, '丁波', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通220', NULL, NULL, 'p13909572950', '4918779.0');
INSERT INTO `person` VALUES (9715, '石志宇', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通220', NULL, NULL, 'p13995373732', '4918772.0');
INSERT INTO `person` VALUES (9716, '刘俊', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通220', NULL, NULL, 'p15009603226', '4915176.0');
INSERT INTO `person` VALUES (9717, '张吉生', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '调度大楼2002', NULL, NULL, 'p13895651032', '4912464.0');
INSERT INTO `person` VALUES (9718, '贾博', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p15909518098', '4915157.0');
INSERT INTO `person` VALUES (9719, '郭景维', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13895117191', '4915129.0');
INSERT INTO `person` VALUES (9720, '沈青', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通219', NULL, NULL, 'p13895117991', '4918972.0');
INSERT INTO `person` VALUES (9721, '常冠青', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p17189598959', '4915167.0');
INSERT INTO `person` VALUES (9722, '刘子豪', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '调度大楼2002', NULL, NULL, 'p13892150625', '4918971.0');
INSERT INTO `person` VALUES (9723, '刘永胜', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '调度大楼2001', NULL, NULL, 'p13995116837', '4913117.0');
INSERT INTO `person` VALUES (9724, '郭磊', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '调度大楼2001', NULL, NULL, 'p13995211909', '4913341.0');
INSERT INTO `person` VALUES (9725, '张波', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13519510462', '4915117.0');
INSERT INTO `person` VALUES (9726, '刘国洋', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p18395111516', '4912476.0');
INSERT INTO `person` VALUES (9727, '康乐', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13895313188', '4913282.0');
INSERT INTO `person` VALUES (9728, '党引', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13619591091', '4915489.0');
INSERT INTO `person` VALUES (9729, '刘思尧', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p15121988894', '4914668.0');
INSERT INTO `person` VALUES (9730, '彭骞', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p13619506130', '4915760.0');
INSERT INTO `person` VALUES (9731, '刘涛', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '调度大楼2001', NULL, NULL, 'p15909588086', '4913343.0');
INSERT INTO `person` VALUES (9732, '徐悦', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p18795085075', '4912897.0');
INSERT INTO `person` VALUES (9733, '杨飞', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13519295108', '4918081.0');
INSERT INTO `person` VALUES (9734, '王堃', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p15209515285', '4918389.0');
INSERT INTO `person` VALUES (9735, '李雪松', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通502', NULL, NULL, 'p15809663912', '4913938.0');
INSERT INTO `person` VALUES (9736, '刘峰', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通220', NULL, NULL, 'p15296907402', '4913298.0');
INSERT INTO `person` VALUES (9737, '刘家旭', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通217', NULL, NULL, 'p13895410861', '4918175.0');
INSERT INTO `person` VALUES (9738, '赵中英', '专责', '国网宁夏电力有限公司信通公司', NULL, NULL, NULL, NULL, NULL, NULL, '信通220', NULL, NULL, 'p15202617807', '4915603.0');
COMMIT;

-- ----------------------------
-- Table structure for recondition
-- ----------------------------
DROP TABLE IF EXISTS `recondition`;
CREATE TABLE `recondition` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NU` varchar(200) NOT NULL COMMENT '编号',
  `RNAME` varchar(500) NOT NULL COMMENT '检修工作名称',
  `CREATETIME` datetime(6) NOT NULL COMMENT '记录创建时间',
  `RSTARTTIME` datetime(6) NOT NULL COMMENT '检修开始时间',
  `RENDTIME` datetime(6) NOT NULL COMMENT '检修结束时间',
  `CONFIRM` tinyint(1) DEFAULT NULL COMMENT '是否通过会审',
  `CREATEMAN` int(50) NOT NULL COMMENT '创建人',
  `WATCHMAN` int(50) DEFAULT NULL COMMENT '监护人',
  `AUDITMAN` int(50) DEFAULT NULL COMMENT '审核人',
  `RTYPE` varchar(50) DEFAULT NULL COMMENT '检修类型',
  `RLEVE` varchar(50) DEFAULT NULL COMMENT '检修级别',
  `RCONTEXT` varchar(800) DEFAULT NULL COMMENT '检修内容',
  `SCOPE` varchar(800) DEFAULT NULL COMMENT '影响范围',
  `SGCCCONFIRM` tinyint(1) DEFAULT NULL COMMENT '是否国网信通审批',
  `DPCONFIRM` tinyint(1) DEFAULT NULL COMMENT '是否灾备审批',
  `SGCCSDCONFIRM` tinyint(1) DEFAULT NULL COMMENT '是否国网营销审批',
  `RWINDOW` tinyint(1) DEFAULT NULL COMMENT '是否检修窗口',
  `ISDOWN` tinyint(1) DEFAULT NULL COMMENT '是否停运',
  `ISRUNTYPECHANGE` tinyint(1) DEFAULT NULL COMMENT '运行方式是否发生变化',
  `RISK` varchar(500) DEFAULT NULL COMMENT '风险等级评估',
  `TIMECODE` varchar(100) DEFAULT NULL COMMENT '时长编号',
  `SGCCCSCONFIRM` tinyint(1) DEFAULT NULL COMMENT '是否总部客服审批',
  PRIMARY KEY (`ID`),
  KEY `CREATEMAN` (`CREATEMAN`),
  KEY `WATCHMAN` (`WATCHMAN`),
  KEY `AUDITMAN` (`AUDITMAN`),
  CONSTRAINT `RECONDITION_ibfk_1` FOREIGN KEY (`CREATEMAN`) REFERENCES `person` (`ID`),
  CONSTRAINT `RECONDITION_ibfk_2` FOREIGN KEY (`WATCHMAN`) REFERENCES `person` (`ID`),
  CONSTRAINT `RECONDITION_ibfk_3` FOREIGN KEY (`AUDITMAN`) REFERENCES `person` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recondition
-- ----------------------------
BEGIN;
INSERT INTO `recondition` VALUES (1, '333', '111111', '2017-01-01 01:11:01.000000', '2017-01-01 01:11:01.000000', '2017-01-01 01:11:01.000000', NULL, 1, 1, 1, '1212', '12121', '212', '12121', NULL, NULL, NULL, NULL, NULL, NULL, '231323', '', NULL);
INSERT INTO `recondition` VALUES (2, '333', '111111', '2017-01-01 01:11:01.000000', '2017-01-01 01:11:01.000000', '2017-01-01 01:11:01.000000', 1, 1, 1, 1, '1212', '12121', '212', '12121', NULL, NULL, NULL, NULL, NULL, NULL, '231323', '', NULL);
COMMIT;

-- ----------------------------
-- Table structure for rols
-- ----------------------------
DROP TABLE IF EXISTS `rols`;
CREATE TABLE `rols` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `rolsname` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for rolspermission
-- ----------------------------
DROP TABLE IF EXISTS `rolspermission`;
CREATE TABLE `rolspermission` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `rolsid` int(20) DEFAULT NULL,
  `permissionsid` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rolsid` (`rolsid`),
  KEY `permissionsid` (`permissionsid`),
  CONSTRAINT `rolspermission_ibfk_1` FOREIGN KEY (`rolsid`) REFERENCES `rols` (`id`),
  CONSTRAINT `rolspermission_ibfk_2` FOREIGN KEY (`permissionsid`) REFERENCES `permissions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for systeminfo
-- ----------------------------
DROP TABLE IF EXISTS `systeminfo`;
CREATE TABLE `systeminfo` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `SYSTEMNAME` varchar(100) DEFAULT NULL COMMENT '系统名称',
  `DEVOLOOPMENTTYPE` varchar(10) DEFAULT NULL COMMENT '部署类型',
  `SYSTEMMAN` int(10) DEFAULT NULL COMMENT '系统负责人',
  `SECENDMAN` int(10) DEFAULT NULL COMMENT '备岗',
  `SYSTEMINTRO` varchar(500) DEFAULT NULL COMMENT '系统简介',
  `SYSTEMTYPE` varchar(50) DEFAULT NULL COMMENT '系统类型',
  `SYSTEMLEVEL` varchar(20) DEFAULT NULL COMMENT '系统级别',
  `SYSTEMSUPPORTMAN1` int(10) DEFAULT NULL COMMENT '支撑人员',
  `SYSTEMSUPPORTMAN2` int(10) DEFAULT NULL COMMENT '支撑人员2',
  `SYSTEMSUPPORTMAN3` int(10) DEFAULT NULL COMMENT '支撑人员3',
  `SYSTEMSUPPORTMAN4` int(10) DEFAULT NULL COMMENT '支撑人员4',
  `SYSTEMSUPPORTMAN5` int(10) DEFAULT NULL COMMENT '支撑人员5',
  `SYSTEMSUPPORTMAN6` int(10) DEFAULT NULL COMMENT '支撑人员6',
  PRIMARY KEY (`ID`),
  KEY `SYSTEMMAN` (`SYSTEMMAN`),
  KEY `SECENDMAN` (`SECENDMAN`),
  CONSTRAINT `SYSTEMINFO_ibfk_1` FOREIGN KEY (`SYSTEMMAN`) REFERENCES `person` (`ID`),
  CONSTRAINT `SYSTEMINFO_ibfk_2` FOREIGN KEY (`SECENDMAN`) REFERENCES `person` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systeminfo
-- ----------------------------
BEGIN;
INSERT INTO `systeminfo` VALUES (3, '用电信息采集', '二级部署', 1, NULL, '2', '营销类系统', '12', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `systeminfo` VALUES (4, '营销业务应用', '二级部署', 1, NULL, '2', '营销类系统', '12', NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for watchtask
-- ----------------------------
DROP TABLE IF EXISTS `watchtask`;
CREATE TABLE `watchtask` (
  `ID` int(50) NOT NULL AUTO_INCREMENT,
  `WATCHDATE` datetime(6) DEFAULT NULL COMMENT '监护日期',
  `WATCHMAN` int(10) DEFAULT NULL COMMENT '监护人',
  PRIMARY KEY (`ID`),
  KEY `WATCHMAN` (`WATCHMAN`),
  CONSTRAINT `WATCHTASK_ibfk_1` FOREIGN KEY (`WATCHMAN`) REFERENCES `person` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
