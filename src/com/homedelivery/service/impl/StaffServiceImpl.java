package com.homedelivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homedelivery.dao.IStaffDao;
import com.homedelivery.domain.Staff;
import com.homedelivery.service.IStaffService;


@Service
@Transactional
public class StaffServiceImpl implements IStaffService{
	@Autowired
	private IStaffDao staffDao;

	public void save(Staff model) {
		staffDao.save(model);
	}
}