package com.linli.feign.client;

import com.linli.feign.client.domain.Params;
import com.linli.feign.client.feign.GetMethodFeignClient;
import com.linli.feign.client.feign.PostMethodFeignClient;
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
public class PostMethodFeignService implements ApplicationRunner {

    @Autowired
    private PostMethodFeignClient postMethodFeignClient;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(postMethodFeignClient.getSingleRequestParam("单个变量"));

        System.out.println(postMethodFeignClient.getMultiRequestParam("第一个变量", "第二个变量"));

        Params params = new Params("第一个变量", "第二个变量");
        /**
         * 如需使用请取消注释
         */
        //System.out.println(postMethodFeignClient.getMultiRequestParam(params));

        System.out.println(postMethodFeignClient.getRequestBody(params));

        System.out.println(postMethodFeignClient.getRequestParamAndBody("第三个变量", params));

    }


}
