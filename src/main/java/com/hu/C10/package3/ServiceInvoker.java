package com.hu.C10.package3;

import com.hu.C10.util.Debug;
import org.omg.CORBA.Request;

/**
 * @Auther: xupc
 * @Date: 2019/5/5 19:05
 * @Description:
 */
public class ServiceInvoker {
    //保存唯一实例
    private static  final ServiceInvoker INSTANCE = new ServiceInvoker();
    //负载均衡器实例,满足多线程访问的值具有原子性
    private volatile LoadBalancer loadBalancer;

    private ServiceInvoker(){

    }

    /**
     * 获取当前类的唯一实例
     */
    public static ServiceInvoker getInstance() {
        return INSTANCE;
    }

    public void dispatchRequest(Request request){
        Endpoint endpoint = getLoadBalancer().nextEndpoint();


        if (null == endpoint) {
            // 省略其他代码

            return;
        }

        // 将请求发给下游部件
        dispatchToDownstream(request, endpoint);

    }
    // 真正将指定的请求派发给下游部件
    private void dispatchToDownstream(Request request, Endpoint endpoint) {
        Debug.info("Dispatch request to " + endpoint + ":" + request);
        // 省略其他代码
    }

    public LoadBalancer getLoadBalancer() {
        // 读取负载均衡器实例
        return loadBalancer;
    }

}
