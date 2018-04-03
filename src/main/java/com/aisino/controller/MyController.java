package com.aisino.controller;

import com.aisino.domain.Request;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;
import java.util.Map;

/**
 * Created by zhukaishengy on 2018/4/2.
 */
@Controller
public class MyController {

//    @RequestMapping(value = "/checkTaxNo/{cert}/{ts}/{serverRandom}",method = RequestMethod.GET)
//    public String jspPage(@PathVariable("cert") String cert,@PathVariable("ts") String ts,@PathVariable("serverRandom") String serverRandom,Map<String,Object> map){
//        Request request = new Request(cert,ts,serverRandom,"");
//        System.out.println(request);
//        map.put("key",request);
//        return "query";
//    }
    @RequestMapping(value = "/postTest",method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postPage(@RequestBody Request request, Map<String,Object> map){
        System.out.println(request);
        map.put("key",request);
        return "query";
    }
    @RequestMapping(value = "/checkInvConf",method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String checkInvConf(@RequestBody Request request, Map<String,Object> map){
        System.out.println(request);
        map.put("key",request);
        return "checkInvConf";
    }
    @RequestMapping(value = "/postTest1",method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postPage1(@RequestBody Request request, Map<String,Object> map){
        System.out.println(request);
        return "test";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String jspTest(Map<String,Object> map){
        Request request = new Request();
        request.setCert("912101007600936848");
        request.setTs("1522696780458");
        request.setServerRandom("4155544853455256455248454c4c4f32030024000600000000000000000024008e237c62fd065d9cbebae5d8d66e499b5e7ac25a8e237c62fd065d9cbebae5d8d66e499b");

        System.out.println(request);
        map.put("key",request);
        return "test1";
    }
//    @RequestMapping(value = "/checkTaxNo",method = RequestMethod.GET,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    public String test1(Request request,Map<String,Object> map){
//        System.out.println(request);
//        map.put("key",request);
//        return "query";
//    }
}
