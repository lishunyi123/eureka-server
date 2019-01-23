package com.lishunyi.eurekaserver.com.evnet;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @ClassName: EurekaStateChangeListener
 * @Description: Eureka注册中心事件监听类
 * @Author: 李顺仪
 * @Date: 2019/1/23 14:54
 * @Version: 1.0
 */
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.out.println("【服务下线】：" + "/t" + event.getServerId() + "/t" + event.getAppName() + "/t" + "下线了！");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.out.println("【服务注册】：" + "/t" + instanceInfo.getAppName() + "/t" + "进行注册！");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        System.out.println("【服务续约】：" + "/t" + LocalTime.now() + event.getServerId() + "/t" + event.getAppName() + "/t" + "进行续约！");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.err.println("【注册中心】：启动");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.err.println("【Eureka Server】：启动");
    }
}
