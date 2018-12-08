/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : demo_01

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-12-08 00:14:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `mng_id` int(11) NOT NULL,
  `mng_name` varchar(50) NOT NULL,
  `mng_psw` varchar(50) NOT NULL,
  PRIMARY KEY (`mng_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', 'admin', '123456');
INSERT INTO `manager` VALUES ('2', 'lili', '123456');
INSERT INTO `manager` VALUES ('3', 'momo', '123456');

-- ----------------------------
-- Table structure for privileg
-- ----------------------------
DROP TABLE IF EXISTS `privileg`;
CREATE TABLE `privileg` (
  `mng_id` int(11) NOT NULL,
  `prc_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privileg
-- ----------------------------
INSERT INTO `privileg` VALUES ('1', '2');
INSERT INTO `privileg` VALUES ('1', '2');
INSERT INTO `privileg` VALUES ('2', '1');
INSERT INTO `privileg` VALUES ('3', '2');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `prc_id` int(11) NOT NULL,
  `prc_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '快乐美食');
INSERT INTO `project` VALUES ('2', '极品美食');

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `usr_id` int(11) NOT NULL,
  `sign_time` datetime NOT NULL,
  `prc_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign
-- ----------------------------
INSERT INTO `sign` VALUES ('1', '2014-10-01 08:20:00', '1');
INSERT INTO `sign` VALUES ('1', '2014-10-02 08:50:00', '1');
INSERT INTO `sign` VALUES ('2', '2014-10-01 08:20:00', '1');
INSERT INTO `sign` VALUES ('2', '2014-10-02 08:20:00', '1');
INSERT INTO `sign` VALUES ('3', '2014-10-01 08:20:00', '2');
INSERT INTO `sign` VALUES ('3', '2014-10-02 08:31:00', '2');
INSERT INTO `sign` VALUES ('4', '2014-10-01 08:20:00', '2');
INSERT INTO `sign` VALUES ('4', '2014-10-02 08:20:00', '2');
INSERT INTO `sign` VALUES ('1', '2014-10-03 08:20:00', '1');
INSERT INTO `sign` VALUES ('1', '2014-10-04 08:20:00', '1');
INSERT INTO `sign` VALUES ('3', '2014-10-03 08:20:00', '1');
INSERT INTO `sign` VALUES ('3', '2014-10-04 08:30:00', '1');

-- ----------------------------
-- Table structure for usr
-- ----------------------------
DROP TABLE IF EXISTS `usr`;
CREATE TABLE `usr` (
  `usr_id` int(11) NOT NULL,
  `usr_name` varchar(50) NOT NULL,
  `prc_id` int(11) NOT NULL,
  PRIMARY KEY (`usr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usr
-- ----------------------------
INSERT INTO `usr` VALUES ('1', '小明', '1');
INSERT INTO `usr` VALUES ('2', '小丽', '1');
INSERT INTO `usr` VALUES ('3', '小刚', '2');
INSERT INTO `usr` VALUES ('4', '小雪', '2');
