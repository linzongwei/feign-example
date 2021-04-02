package com.linli.feign.server.controller;

import com.linli.feign.server.domain.Params;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author linli
 * @since 2021/4/1 17:57
 */
@RestController
@RequestMapping(value = "getMethod")
public class GetMethodsController {

    /**
     * 参数在请求路径
     * @param param1
     * @return
     */
    @GetMapping(value = "/getPathVariable/{param1}")
    public String getSinglePathVariable(@PathVariable("param1") String param1) {
        return "getPathVariable:" + param1;
    }

    /**
     * 参数在请求路径
     * @param param1
     * @return
     */
    @GetMapping(value = "/getPathVariable/{param1}/{param2}")
    public String getMultiPathVariable(@PathVariable("param1") String param1, @PathVariable("param2") String param2) {
        return "getPathVariable:param1=" + param1 + ", param2=" + param2;
    }

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @GetMapping(value = "/getSingleRequestParam")
    public String getSingleRequestParam(@RequestParam("param1") String param1) {
        return "getSingleRequestParam:" + param1;
    }

    /**
     * 参数在请求参数列表部分
     * @param param1
     * @return
     */
    @GetMapping(value = "/getMultiRequestParam")
    public String getMultiRequestParam(Params param1) {
        return "getMultiRequestParam: " + param1.toString();
    }

}
