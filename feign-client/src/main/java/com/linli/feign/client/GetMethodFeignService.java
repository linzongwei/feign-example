package com.linli.feign.client;

import com.linli.feign.client.domain.Params;
import com.linli.feign.client.feign.GetMethodFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author linli
 * @since 2020/12/3 9:03
 */
@Component
public class GetMethodFeignService implements ApplicationRunner {

    @Autowired
    private GetMethodFeignClient getMethodFeignClient;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(getMethodFeignClient.getSinglePathVariable("单个变量"));

        System.out.println(getMethodFeignClient.getMultiPathVariable("第一个变量", "第二个变量"));

        System.out.println(getMethodFeignClient.getSingleRequestParam("单个变量"));

        System.out.println(getMethodFeignClient.getMultiRequestParam("第一个变量", "第二个变量"));

        /**
         * 如需使用请取消注释
         */
        // Params params = new Params("第一个变量", "第二个变量");
        //System.out.println(getMethodFeignClient.getMultiRequestParam(params));

    }


}
