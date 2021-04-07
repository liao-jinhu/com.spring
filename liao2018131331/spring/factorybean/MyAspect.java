package liao2018131331.spring.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_Permissions();
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }

    public void check_Permissions(){

        System.out.println("检查");
    }
    public void log(){

        System.out.println("日志");
    }
}
