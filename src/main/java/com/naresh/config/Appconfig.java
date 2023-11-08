package com.naresh.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.naresh.entity.Voter;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.naresh.*")
public class Appconfig {

	//1.configure web mvc things
	@Bean
	public InternalResourceViewResolver ivr() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/Views/");
		vr.setSuffix(".jsp");
		return vr;
	}

	//2.Database
	@Bean
	public DriverManagerDataSource driverManagerDataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("220100");
		return ds;
	}

	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(driverManagerDataSource());
		lsf.setHibernateProperties(hibernateprops());
		lsf.setAnnotatedClasses(Voter.class);
		return lsf;
	}
	@Bean
	public Properties hibernateprops() {
		Properties props=new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.show_sql", true);
		props.put("hibernate.format_sql", true);
		props.put("hibernate.hbm2ddl.auto", "update");
		return props;
	}
	//4.hibernate tx mgr
	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager tx=new HibernateTransactionManager();
		tx.setSessionFactory(localSessionFactoryBean().getObject());
		return tx;
	}
	
	@Bean
	public HibernateTemplate htm() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(localSessionFactoryBean().getObject());
		return ht;
	}
}
