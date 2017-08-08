package delegate;

import java.lang.reflect.Method;

/**
 * Created by Bill on 2017/8/8.
 * 事件对象的封装类
 */
public class Event {

    // 要执行方法的对象
    private Object object;
    // 要执行的方法名称
    private String methodName;
    // 要执行方法的参数
    private Object[] params;
    // 要执行方法的参数类型
    private Class[] paramsTypes;

    public Event() {
    }

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamsTypes(this.params);
    }

    private void contractParamsTypes(Object[] params) {
        this.paramsTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramsTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(methodName, paramsTypes);
        if (method == null)
            return;
        method.invoke(object, params);
    }

}
