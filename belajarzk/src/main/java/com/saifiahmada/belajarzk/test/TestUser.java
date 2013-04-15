package com.saifiahmada.belajarzk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.belajarzk.bean.TrioMstuser;
import com.saifiahmada.belajarzk.dao.TrioMstuserDao;
import com.saifiahmada.belajarzk.facade.MasterFacade;

/** @author Saifi Ahmada Feb 8, 2013 11:22:27 AM  **/

public class TestUser {
	
	public static void main(String[] args) {
		
		System.out.println("Mulai");
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		MasterFacade mf = (MasterFacade) ap.getBean("masterFacade");
		
		TrioMstuserDao dao = mf.getTrioMstuserDao();
		
		TrioMstuser user = new TrioMstuser("arya");
		
		user.setVpassword("23rt");
		user.setVstat("A");
		
		dao.save(user, "saifi");
		
		System.out.println("Selesai && Sukses");
		
		
		
	}

}
