/*
Navicat MySQL Data Transfer

Source Server         : bian
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : shakehand

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-08-31 22:43:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `ADMIN_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADMIN_NAME` varchar(20) NOT NULL,
  `ADMIN_PASSWORD` varchar(20) NOT NULL,
  `ADMIN_ROLE` varchar(1) DEFAULT '0' COMMENT '0普通管理员1超级管理员',
  PRIMARY KEY (`ADMIN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456', '0');

-- ----------------------------
-- Table structure for `comment_info`
-- ----------------------------
DROP TABLE IF EXISTS `comment_info`;
CREATE TABLE `comment_info` (
  `COMMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `COMPANY_ID` int(11) DEFAULT NULL,
  `COMMENT_INFO` varchar(255) DEFAULT NULL,
  `COMMENT_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `COMMENT_SCORE` int(11) DEFAULT NULL,
  `COMMENT_NUM` int(11) DEFAULT '0',
  PRIMARY KEY (`COMMENT_ID`),
  KEY `USER_ID` (`USER_ID`),
  KEY `COMPANY_ID` (`COMPANY_ID`),
  CONSTRAINT `comment_info_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user_info` (`USER_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `comment_info_ibfk_2` FOREIGN KEY (`COMPANY_ID`) REFERENCES `company_info` (`COMPANY_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_info
-- ----------------------------
INSERT INTO `comment_info` VALUES ('1', '1', '1', '这个公司真好', '2018-08-30 11:29:57', '5', '0');

-- ----------------------------
-- Table structure for `company_info`
-- ----------------------------
DROP TABLE IF EXISTS `company_info`;
CREATE TABLE `company_info` (
  `COMPANY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMPANY_ACCOUNT` varchar(255) DEFAULT NULL,
  `COMPANY_TEL` varchar(20) DEFAULT NULL,
  `COMPANY_PASSWORD` varchar(20) DEFAULT '123456',
  `COMPANY_USER` varchar(20) DEFAULT '注册姓名',
  `COMPANY_NAME` varchar(50) DEFAULT '公司全称',
  `COMPANY_EMAIL` varchar(30) DEFAULT NULL,
  `COMPANY_LOGO` varchar(255) DEFAULT NULL,
  `COMPANY_PROFILE` varchar(255) DEFAULT NULL,
  `COMPANY_SCALE` varchar(255) DEFAULT NULL,
  `COMPANY_SECTOR` varchar(255) DEFAULT NULL,
  `COMPANY_STAGE` varchar(255) DEFAULT NULL,
  `COMPANY_ADDRESS` varchar(255) DEFAULT NULL,
  `COMPANY_PRODUCT` varchar(255) DEFAULT NULL,
  `COMPANY_DETAILPROFILE` varchar(255) DEFAULT NULL,
  `COMPANY_EVALUATION` varchar(255) DEFAULT NULL,
  `COMPANY_LABEL` varchar(255) DEFAULT NULL COMMENT '公司文化',
  `COMPANY_STATUS` varchar(255) DEFAULT '0',
  `COMPANY_PICPRODUCT` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`COMPANY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_info
-- ----------------------------
INSERT INTO `company_info` VALUES ('1', null, '1386668888', '123456', '李四', '握手公司', '123@qq.com', '', '1111', '1111', '1111', '11111', '123', '123', '123', '123', '123', '0', null);
INSERT INTO `company_info` VALUES ('2', null, '2222', '2222', '222', '2222', '2222', '222', '2222', '2222', '232323', '232323', '3232323', '2333322', '222233', '2223', '2222', '0', null);

-- ----------------------------
-- Table structure for `delivery_info`
-- ----------------------------
DROP TABLE IF EXISTS `delivery_info`;
CREATE TABLE `delivery_info` (
  `DELIVERY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `COMPANY_ID` int(11) DEFAULT NULL,
  `RESUME_ID` int(11) DEFAULT NULL,
  `JOB_ID` int(11) DEFAULT NULL,
  `IS_CHECK` varchar(2) DEFAULT '0',
  `IS_SUCCESS` varchar(2) DEFAULT '0',
  `DELIVERY_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`DELIVERY_ID`),
  KEY `USER_ID` (`USER_ID`),
  KEY `COMPANY_ID` (`COMPANY_ID`),
  KEY `RESUME_ID` (`RESUME_ID`),
  KEY `JOB_ID` (`JOB_ID`),
  CONSTRAINT `delivery_info_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user_info` (`USER_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `delivery_info_ibfk_2` FOREIGN KEY (`COMPANY_ID`) REFERENCES `company_info` (`COMPANY_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `delivery_info_ibfk_4` FOREIGN KEY (`RESUME_ID`) REFERENCES `resume_info` (`RESUME_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `delivery_info_ibfk_5` FOREIGN KEY (`JOB_ID`) REFERENCES `job_info` (`JOB_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of delivery_info
-- ----------------------------
INSERT INTO `delivery_info` VALUES ('1', '1', '1', '1', null, '0', '0', '2018-08-30 11:29:23');

-- ----------------------------
-- Table structure for `job_info`
-- ----------------------------
DROP TABLE IF EXISTS `job_info`;
CREATE TABLE `job_info` (
  `JOB_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMPANY_ID` int(11) DEFAULT NULL,
  `POSITION_ID` int(11) DEFAULT NULL,
  `JOB_SALARY` varchar(255) DEFAULT NULL,
  `JOB_ADDRESS` varchar(255) DEFAULT NULL COMMENT '只能填写 城市',
  `JOB_EXPERIENCE` varchar(255) DEFAULT NULL,
  `JOB_EDUCATION` varchar(255) DEFAULT NULL,
  `JOB_KIND` varchar(255) DEFAULT NULL,
  `JOB_RELEASETIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `JOB_DESCRIPTION` varchar(255) DEFAULT '',
  PRIMARY KEY (`JOB_ID`),
  KEY `COMPANY_ID` (`COMPANY_ID`),
  KEY `POSITION_ID` (`POSITION_ID`),
  CONSTRAINT `job_info_ibfk_1` FOREIGN KEY (`COMPANY_ID`) REFERENCES `company_info` (`COMPANY_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `job_info_ibfk_2` FOREIGN KEY (`POSITION_ID`) REFERENCES `position_info` (`POSITION_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job_info
-- ----------------------------
INSERT INTO `job_info` VALUES ('1', '1', '1', '1000', '北京', '3-5年工作经验', '本科及以上', 'java', '2018-08-30 11:29:09', '工作很辛苦');

-- ----------------------------
-- Table structure for `news_info`
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `NEWS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADMIN_ID` int(11) DEFAULT NULL,
  `NEWS_TITLE` varchar(255) DEFAULT NULL,
  `NEWS_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `NEWS_DETAILS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`NEWS_ID`),
  KEY `ADMIN_ID` (`ADMIN_ID`),
  CONSTRAINT `news_info_ibfk_1` FOREIGN KEY (`ADMIN_ID`) REFERENCES `admin` (`ADMIN_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_info
-- ----------------------------
INSERT INTO `news_info` VALUES ('1', '1', '发布消息', '2018-08-30 11:28:18', '今天我们做网页');

-- ----------------------------
-- Table structure for `position_info`
-- ----------------------------
DROP TABLE IF EXISTS `position_info`;
CREATE TABLE `position_info` (
  `POSITION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `POSITION_NAME` varchar(20) DEFAULT NULL,
  `POSITION_INFO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`POSITION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position_info
-- ----------------------------
INSERT INTO `position_info` VALUES ('1', 'java', 'java从入门到gg');

-- ----------------------------
-- Table structure for `resume_info`
-- ----------------------------
DROP TABLE IF EXISTS `resume_info`;
CREATE TABLE `resume_info` (
  `RESUME_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `POSITION_ID` int(11) DEFAULT NULL,
  `RESUME_PICADDRESS` varchar(255) DEFAULT NULL,
  `RESUME_NAME` varchar(50) DEFAULT NULL,
  `RESUME_SEX` varchar(10) DEFAULT NULL,
  `RESUME_ETHNIC` varchar(50) DEFAULT NULL,
  `RESUME_AGE` int(5) DEFAULT NULL,
  `RESUME_ADDRESS` varchar(255) DEFAULT NULL,
  `RESUME_TEL` varchar(20) DEFAULT NULL,
  `RESUME_EMAIL` varchar(30) DEFAULT NULL,
  `RESUME_BIRTHPLACE` varchar(255) DEFAULT NULL,
  `RESUME_SALARY` varchar(255) DEFAULT NULL,
  `RESUME_EDUCATION` varchar(255) DEFAULT NULL,
  `RESUME_TRAINING` varchar(255) DEFAULT NULL,
  `RESUME_SKILL` varchar(255) DEFAULT NULL,
  `RESUME_EXPERIENCE` varchar(255) DEFAULT NULL,
  `RESUME_HOBBY` varchar(255) DEFAULT NULL,
  `RESUME_EVALUATION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RESUME_ID`),
  KEY `USER_ID` (`USER_ID`),
  KEY `POSITION_ID` (`POSITION_ID`),
  CONSTRAINT `resume_info_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user_info` (`USER_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `resume_info_ibfk_2` FOREIGN KEY (`POSITION_ID`) REFERENCES `position_info` (`POSITION_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resume_info
-- ----------------------------
INSERT INTO `resume_info` VALUES ('1', '1', '1', null, '张三', '男', '汉族', '20', '天津', '1234445555', '987@qq.com', '北京', '1000', '本科', '培训', 'java', '项目', '睡觉', '11111');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_TEL` varchar(30) NOT NULL,
  `USER_PASSWORD` varchar(50) NOT NULL DEFAULT '123456',
  `USER_NAME` varchar(30) DEFAULT NULL,
  `USER_SEX` varchar(10) DEFAULT NULL,
  `USER_EMAIL` varchar(50) DEFAULT NULL,
  `USER_POSITION` varchar(20) DEFAULT NULL,
  `USER_INTRODUCT` varchar(255) DEFAULT NULL,
  `USER_PICADDRESS` varchar(255) DEFAULT NULL,
  `USER_LOCK` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '17855558888', '123456', '张三', '男', '123@qq.com', '员工', '我叫张三', null, null);
INSERT INTO `user_info` VALUES ('2', '', '', '', '', '', '', '', '', null);
INSERT INTO `user_info` VALUES ('3', '', '', '', '', '', '', '', '', null);
INSERT INTO `user_info` VALUES ('4', '123', '123', '123', '123', '123', '123', '123', '123', null);
