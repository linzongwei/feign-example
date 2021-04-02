package com.linli.feign.client.feign;

import com.linli.feign.client.domain.Params;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 *
 * @author linli
 * @since 2020/12/31 15:05
 */
@org.springframework.cloud.openfeign.FeignClient(value = "feign-server-post",
        url = "http://localhost:8089")
@RequestMapping("postMethod")
public interface PostMethodFeignClient {

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @PostMapping(value = "/getSingleRequestParam")
    String getSingleRequestParam(@RequestParam("param1") String param1);

    /**
     * ============== 请求路径为/getMultiRequestParam，等同于下个方法，如需使用下个方法请注释该方法 =====================
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @PostMapping(value = "/getMultiRequestParam")
    String getMultiRequestParam(@RequestParam("param1") String param1,
            @RequestParam("param2") String param2);

    /**
     *  ================= 请求路径为/getMultiRequestParam，等同于上个方法，如需使用该方法请取消注释，并对上个方法做注释 ===================
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
//    @PostMapping(value = "/getMultiRequestParam")
//    String getMultiRequestParam(Params param1);

    /**
     * 参数在请求体
     * @param param1
     * @return
     */
    @PostMapping(value = "/getRequestBody")
    String getRequestBody(@RequestBody Params param1);

    /**
     * 参数在请求路径上 且 在请求体中
     * @param param3
     * @param params
     * @return
     */
    @PostMapping(value = "/getRequestParamAndBody")
    String getRequestParamAndBody(@RequestParam("param3") String param3, @RequestBody Params params);

}
