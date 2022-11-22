package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.XMLDao.XMLWriteDao;

@Service
public class XMLServiceImpl implements XMLService {

	@Autowired
	XMLWriteDao writeDao;

	@Override
	public void write() {
		writeDao.write();
	}

}
