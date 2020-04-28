package com.ihubin.geekbangspring.ioc.overview.dependency.repository;

import com.ihubin.geekbangspring.ioc.overview.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

public class UserRepository {

    private Collection<User> users; // 自定义 Bean

    private BeanFactory beanFactory; // 内建非 Bean 对象（依赖）

    private ObjectFactory<User> userObjectFactory;

    private ObjectFactory<ApplicationContext> ObjectFactory;

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public ObjectFactory<User> getUserObjectFactory() {
        return userObjectFactory;
    }

    public void setUserObjectFactory(ObjectFactory<User> userObjectFactory) {
        this.userObjectFactory = userObjectFactory;
    }

    public org.springframework.beans.factory.ObjectFactory<ApplicationContext> getObjectFactory() {
        return ObjectFactory;
    }

    public void setObjectFactory(org.springframework.beans.factory.ObjectFactory<ApplicationContext> objectFactory) {
        ObjectFactory = objectFactory;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                '}';
    }
}
