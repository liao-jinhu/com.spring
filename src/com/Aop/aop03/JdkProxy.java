package src.com.Aop.aop03;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private UserDao userDao;

    public  Object createProxy(UserDao userDao){
        this.userDao =userDao;
        ClassLoader classLoader =JdkProxy.class.getClassLoader();
        Class[] clazz = userDao.getClass() .getInterfaces();
        return Proxy.newProxyInstance(classLoader,clazz,this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect aspect = new MyAspect();
        aspect.check_Permissions();
        Object obj = method.invoke(userDao,args);
        aspect.log();
        return obj;
    }

}

