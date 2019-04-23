package control;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Control {
	//构建服务套接字
	private ServerSocket server;
	public static final int PORT=9997;
	private ExecutorService es;
	private SMSservice sb;
	public Control() {
		try {
			System.out.println("服务器正在开启。。。");
			
			this.server=new ServerSocket(PORT);
			Thread.sleep(1000);
			System.out.println("线程正在开启");
			es=Executors.newCachedThreadPool();
			this.sb=new SMSserviceimpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(){
		while(true){
			try {
				Socket client=this.server.accept();
				System.out.println("用户"+client.getInetAddress().getHostAddress()+"已连接");
				ControlThread ct=new ControlThread(client,sb);
				es.submit(ct);
				int activeCount = ((ThreadPoolExecutor)es).getActiveCount();
				System.out.println("当前在线活跃用户"+activeCount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
