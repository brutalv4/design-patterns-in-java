package proxy.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

  private Object obj;

  private SecurityProxy(Object obj) {
    this.obj = obj;
  }

  public static Object newInstance(Object obj) {
    return java.lang.reflect.Proxy.newProxyInstance(
        obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().contains("post")) {
      throw new IllegalAccessException("Post are not allowed now!");
    } else {
      return method.invoke(obj, args);
    }
  }
}
