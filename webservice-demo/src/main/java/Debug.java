/**
 * Created by liuyanan on 2018-07-20.
 */
public class Debug {

    public static String[] pns;

    public static java.util.Map pts;

    public static String[] mns;

    public static String[] dmns;

    public static Class[] mts0;

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String n) {
        return pts.containsKey($1);
    }

    public Class getPropertyType(String n) {
        return (Class) pts.get($1);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object o, String n, Object v) {
        com.gupaoedu.practice.dubbo.service.IHelloService w;
        try {
            w = ((com.gupaoedu.practice.dubbo.service.IHelloService) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + $2 + "\" filed or setter method in class com.gupaoedu.practice.dubbo.service.IHelloService.");
    }

    public Object getPropertyValue(Object o, String n) {
        com.gupaoedu.practice.dubbo.service.IHelloService w;
        try {
            w = ((com.gupaoedu.practice.dubbo.service.IHelloService) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + $2 + "\" filed or setter method in class com.gupaoedu.practice.dubbo.service.IHelloService.");
    }

    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
        com.gupaoedu.practice.dubbo.service.IHelloService w;
        try {
            w = ((com.gupaoedu.practice.dubbo.service.IHelloService) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("sayHello".equals($2) && $3.length == 1) {
                return ($w) w.sayHello((java.lang.String) $4[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class com.gupaoedu.practice.dubbo.service.IHelloService.");
    }

    public abstract java.lang.String com.gupaoedu.practice.dubbo.service.IHelloService.sayHello(java.lang.String)

    dubbo://192.168.232.1:20880/com.gupaoedu.practice.dubbo.service.IHelloService?anyhost=true&application=dubbo-serverqqq&dubbo=2.5.3&interface=com.gupaoedu.practice.dubbo.service.IHelloService&methods=sayHello&owner=lyn&pid=6908&side=provider&timestamp=1532051416574

}
