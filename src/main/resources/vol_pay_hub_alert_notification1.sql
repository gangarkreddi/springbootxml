CREATE TABLE `vol_pay_hub_alert_notification1entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `eventid` varchar(255) DEFAULT NULL,
  `source_system_id` varchar(255) DEFAULT NULL,
  `unique_reference_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
