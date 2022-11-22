CREATE TABLE `entity` (
  `content_id` bigint NOT NULL AUTO_INCREMENT,
  `message_subject` varchar(255) DEFAULT NULL,
  `vol_pay_hub_alert_notification1_id` bigint DEFAULT NULL,
  PRIMARY KEY (`content_id`),
  KEY `FKqq84ugusfmjmiw4jedfr57a3d` (`vol_pay_hub_alert_notification1_id`),
  CONSTRAINT `FKqq84ugusfmjmiw4jedfr57a3d` FOREIGN KEY (`vol_pay_hub_alert_notification1_id`) REFERENCES `vol_pay_hub_alert_notification1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
