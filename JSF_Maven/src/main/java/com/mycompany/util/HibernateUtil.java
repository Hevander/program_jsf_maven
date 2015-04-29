/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Hevander
 */
public class HibernateUtil {
    private static final SessionFactory sessionfactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
        try {
            System.out.println("Tentando configurar a Session Factory");
            
            Configuration configuration = new Configuration().configure();
            
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionfactory = configuration.buildSessionFactory(serviceRegistry);
            
            System.out.println("Session Factory criada corretamente!");
            
        } catch (Exception er) {
            System.out.println("Ocorreu um erro ao iniciar a Session Factory" + er);
            throw new ExceptionInInitializerError(er);
        }               
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
    
    
}
