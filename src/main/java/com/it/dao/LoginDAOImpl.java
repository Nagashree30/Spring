package com.it.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.it.entity.LoginEntity;

import lombok.Setter;
@Setter
@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void saveLoginDetails(LoginEntity entity) {
		System.out.println("created "+this.getClass().getSimpleName());
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
