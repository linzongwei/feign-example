package com.linli.feign.client.feign;

import com.linli.feign.client.domain.Params;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 *
 * @author linli
 * @since 2020/12/31 15:05
 */
@org.springframework.cloud.openfeign.FeignClient(value = "feign-server-get",
        url = "http://localhost:8089")
@RequestMapping("getMethod")
public interface GetMethodFeignClient {

    /**
     * 参数在请求路径
     * @param param1
     * @return
     */
    @GetMapping(value = "/getPathVariable/{param1}")
    String getSinglePathVariable(@PathVariable("param1") String param1);

    /**
     * 参数在请求路径
     * @param param1
     * @return
     */
    @GetMapping(value = "/getPathVariable/{param1}/{param2}")
    String getMultiPathVariable(@PathVariable("param1") String param1, @PathVariable("param2") String param2);

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @GetMapping(value = "/getSingleRequestParam")
    String getSingleRequestParam(@RequestParam("param1") String param1);

    /**
     *
     * ============== 请求路径为/getMultiRequestParam，等同于下个方法，如需使用下个方法请注释该方法 =====================
     *
     * 参数在请求参数列表部分
     * @param param1
     * @return
     *
     */
    @GetMapping(value = "/getMultiRequestParam")
    String getMultiRequestParam(@RequestParam("param1") String param1,
            @RequestParam("param2") String param2);

    /**
     * ================= 请求路径为/getMultiRequestParam，等同于上个方法，如需使用该方法请取消注释，并对上个方法做注释 ===================
     * 参数在请求参数列表部分
     * @param params
     * @return
     *
     */
//    @GetMapping(value = "/getMultiRequestParam")
//    String getMultiRequestParam(@SpringQueryMap Params params);

}
