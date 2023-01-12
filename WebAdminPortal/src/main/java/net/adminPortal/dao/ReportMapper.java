package net.adminPortal.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.adminPortal.entity.Report;
import net.adminPortal.util.MyBatisUtil;


public class ReportMapper {
	public void saveReport(Report report){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertReport", report);
		session.commit();
		session.close();
	}
	
	public void updateReport(Report report){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateReport", report);
		session.commit();
		session.close();
	}
	
	public void deleteReport(int REPORTID){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteReport", REPORTID);
		session.commit();
		session.close();
	}
	
	public List<Report> getAllReports(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Report> reportList = session.selectList("getAllReports");
		session.commit();
		session.close();
		return reportList;
	}
	
	public Report findById(int REPORTID){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Report report = (Report) session.selectOne("findById", REPORTID);
		session.commit();
		session.close();
		return report;
	}
}
