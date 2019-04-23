
package control;

import java.lang.reflect.Proxy;

public class proxyclient {


	public static <T> T getClient(Class<T> clazz, String ip, int port) {
		//1:当前对象的类加载器  2：客户端中介  3：市级代理接口
		return (T) Proxy.newProxyInstance(proxyclient.class.getClassLoader(), new Class[]{clazz},new ClientHandler(ip, port));	
	}

}