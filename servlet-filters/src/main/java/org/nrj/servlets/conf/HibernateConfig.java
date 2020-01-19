package org.nrj.servlets.conf;

import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.nrj.servlets.entities.User;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {

            try {

                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties

                Properties settings = new Properties();

                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");

                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/gadgets?useSSL=false");

                settings.put(Environment.USER, "root");

                settings.put(Environment.PASS, "root");

                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(User.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()

                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        return sessionFactory;

    }
    
	/*
	 * public static SessionFactory getSessionFactory() {
	 * 
	 * Configuration configuration = new Configuration().configure();
	 * 
	 * Properties prop= new Properties(); prop.setProperty("hibernate.dialect",
	 * "org.hibernate.dialect.MySQLDialect");
	 * prop.setProperty(" hibernate.connection.driver_class",
	 * "com.mysql.jdbc.Driver"); prop.setProperty("hibernate.connection.url",
	 * "jdbc:mysql://localhost:3306/gadgets");
	 * prop.setProperty("hibernate.connection.username", "root");
	 * prop.setProperty("hibernate.connection.password", "root");
	 * 
	 * prop.setProperty("hbm2ddl.auto", "create"); prop.setProperty("show_sql",
	 * "true");
	 * 
	 * 
	 * StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
	 * .applySettings(prop);
	 * 
	 * //addProperties(prop)
	 * 
	 * SessionFactory sessionFactory = new AnnotationConfiguration()
	 * .addPackage("com.concretepage.persistence") .addProperties(prop)
	 * .addAnnotatedClass(User.class) .buildSessionFactory();
	 * 
	 * 
	 * 
	 * //configuration.buildSessionFactory(builder.build());
	 * 
	 * 
	 * //configuration.addAnnotatedClass(User.class);
	 * 
	 * 
	 * 
	 * SessionFactory sessionFactory = new AnnotationConfiguration()
	 * .addPackage("test.animals") //the fully qualified package name
	 * .addAnnotatedClass(Flight.class) .addAnnotatedClass(Sky.class)
	 * .addAnnotatedClass(Person.class) .addAnnotatedClass(Dog.class)
	 * .addResource("test/animals/orm.xml") .configure() .buildSessionFactory();
	 * 
	 * 
	 * return sessionFactory; }
	 */

	public static Criteria userCriteria() {

		Session hibernateSession = getSessionFactory().getCurrentSession();

		return hibernateSession.createCriteria(User.class);
	}
	
//	insert into user (username, mailId, name, password, phoneNumber ) values ("member","member@nrj.org", "Member", "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8", "8800550092");

}
