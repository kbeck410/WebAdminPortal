package net.adminPortal.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.adminPortal.entity.User;
import net.adminPortal.util.MyBatisUtil;


public class UserMapper {
	public void saveUser(User user){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertEmployee", user);
		session.commit();
		session.close();
	}
	
	public void updateUser(User user){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateUser", user);
		session.commit();
		session.close();
	}
	
	public void deleteUser(int USERNAME){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteUser", USERNAME);
		session.commit();
		session.close();
	}
	
	public List<User> getAllUsers(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<User> userList = session.selectList("getAllUsers");
		session.commit();
		session.close();
		return userList;
	}
	
	public User findById(int USERNAME){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		User user = (User) session.selectOne("findById", USERNAME);
		session.commit();
		session.close();
		return user;
	}
}
