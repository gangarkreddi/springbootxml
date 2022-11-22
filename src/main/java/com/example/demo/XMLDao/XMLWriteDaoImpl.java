package com.example.demo.XMLDao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Contents;
import com.example.demo.model.VolPayHubAlertNotification1;
import com.example.demo.repo.VolPayHubAlertNotification1Repo;

@Component
public class XMLWriteDaoImpl implements XMLWriteDao {
	@Autowired
	VolPayHubAlertNotification1Repo repo;

	@Transactional
	public void write() {
		VolPayHubAlertNotification1 obj = new VolPayHubAlertNotification1();
		obj.setEventID("eventId");
		obj.setSourceSystemId("abc");
		Contents contents = new Contents();
		contents.setMessageSubject("Subject");
		;
		obj.setContents(contents);
		repo.save(obj);
	}

}
