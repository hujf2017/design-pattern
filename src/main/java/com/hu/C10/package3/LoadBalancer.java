package com.hu.C10.package3;

/**
 * @Auther: xupc
 * @Date: 2019/5/5 19:10
 * @Description:
 */
public interface LoadBalancer {
    Endpoint nextEndpoint();
}
