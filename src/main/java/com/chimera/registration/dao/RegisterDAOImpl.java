package com.chimera.registration.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.chimera.registration.entity.RegisterEntity;

public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private SessionFactory factory;

	public RegisterDAOImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void saveRegisterDetails(RegisterEntity entity) {
		System.out.println("invoke saveRegisterDetails method");

		Session session = factory.openSession();
		try {
			if (Objects.nonNull(session)) {
				session.beginTransaction();
				System.out.println("transcation stared..");
				session.save(entity);
				session.getTransaction().commit();
				System.out.println("Transaction commited");
				System.out.println("Entity is not null , the entity is saved");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

		finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			}
		}
	}
}
