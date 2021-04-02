package com.linli.feign.server.controller;

import com.linli.feign.server.domain.Params;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author linli
 * @since 2021/4/1 17:57
 */
@RestController
@RequestMapping(value = "postMethod")
public class PostMethodsController {

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @PostMapping(value = "/getSingleRequestParam")
    public String getSingleRequestParam(@RequestParam("param1") String param1) {
        return "getSingleRequestParam:" + param1;
    }

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @PostMapping(value = "/getMultiRequestParam")
    public String getMultiRequestParam(Params param1) {
        return "getMultiRequestParam: " + param1.toString();
    }

    /**
     * 参数在请求体
     * @param param1
     * @return
     */
    @PostMapping(value = "/getRequestBody")
    public String getRequestBody(@RequestBody Params param1) {
        return "getRequestBody: " + param1.toString();
    }

    /**
     * 参数在请求路径上 且 在请求体中
     * @param param3
     * @param params
     * @return
     */
    @PostMapping(value = "/getRequestParamAndBody")
    public String getRequestParamAndBody(@RequestParam("param3") String param3, @RequestBody Params params) {
        return "getRequestParam: " + param3 + ", getRequestBody:" + params.toString();
    }

}
