package zktest;

import java.io.UnsupportedEncodingException;

import com.github.zkclient.IZkClient;
import com.github.zkclient.ZkClient;

public class ZkTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
//		IZkClient zkClient = new ZkClient("zwuserver2.chn.hp.com:13001,zwuserver2.chn.hp.com:14001");
//		IZkClient zkClient = new ZkClient("zwuserver2.chn.hp.com:13001,zwuserver2.chn.hp.com:13002,zwuserver2.chn.hp.com:13003,zwuserver2.chn.hp.com:13004,zwuserver2.chn.hp.com:13005");
//		IZkClient zkClient = new ZkClient("zwuserver2.chn.hp.com:13001,zwuserver2.chn.hp.com:13002,zwuserver2.chn.hp.com:13003,zwuserver2.chn.hp.com:13004,zwuserver2.chn.hp.com:13005,zwuserver2.chn.hp.com:14001,zwuserver2.chn.hp.com:14002,zwuserver2.chn.hp.com:14003,zwuserver2.chn.hp.com:14004,zwuserver2.chn.hp.com:14005");
//		IZkClient zkClient = new ZkClient("zwuserver2.chn.hp.com:2181");
		IZkClient zkClient = new ZkClient("zwuserver2.chn.hp.com:15001,zwuserver2.chn.hp.com:15002,zwuserver2.chn.hp.com:15003,zwuserver2.chn.hp.com:15004,zwuserver2.chn.hp.com:15005");
		
//		
		System.out.println(new String(zkClient.readData("/my_data1"),"utf-8"));
		
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zkClient.close();
	}

}
