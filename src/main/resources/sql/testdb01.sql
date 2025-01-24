/*
Navicat MySQL Data Transfer

Source Server         : 192.168.234.135--slave01
Source Server Version : 50740
Source Host           : 192.168.234.135:3306
Source Database       : testdb01

Target Server Type    : MYSQL
Target Server Version : 50740
File Encoding         : 65001

Date: 2025-01-24 14:21:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for kpi_info_0
-- ----------------------------
DROP TABLE IF EXISTS `kpi_info_0`;
CREATE TABLE `kpi_info_0` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `task_id` int(255) DEFAULT NULL,
  `ne_id` int(255) DEFAULT NULL,
  `mu_id` varchar(255) DEFAULT NULL,
  `mc_id` varchar(255) DEFAULT NULL,
  `period` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1089542520154619914 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for kpi_info_1
-- ----------------------------
DROP TABLE IF EXISTS `kpi_info_1`;
CREATE TABLE `kpi_info_1` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `task_id` int(255) DEFAULT NULL,
  `ne_id` int(255) DEFAULT NULL,
  `mu_id` varchar(255) DEFAULT NULL,
  `mc_id` varchar(255) DEFAULT NULL,
  `period` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1089542520150425690 DEFAULT CHARSET=utf8mb4;
