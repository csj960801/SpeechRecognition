package com.speech.SqlSession;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 마이바티스 사용을 위한 세션연결 제공
 * 
 * @author CSJ
 *
 */
public class SqlSessionOpenner {
	private static Logger sessionLog = LoggerFactory.getLogger(SqlSessionOpenner.class);

	private static String mybatis = "Mybatis/Mybatis-config.xml";
	private static InputStream is;
	private static SqlSessionFactory sessionfactory;

	/**
	 * Sql세션 연결 인스턴스
	 * 
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public static SqlSessionFactory sessionInstance() {
		// Mybatis 설정 파일 경로
		try {
		
			is = Resources.getResourceAsStream(mybatis);
			sessionfactory = new SqlSessionFactoryBuilder().build(is);
	
		} catch (IOException e) {
			sessionLog.info("=======================================");
			sessionLog.info(e.toString());
			sessionLog.info("=======================================");
		}
		return sessionfactory;
	}
}