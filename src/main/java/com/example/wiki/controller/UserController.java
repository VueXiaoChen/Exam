package com.example.wiki.controller;



import com.example.wiki.req.EbookReq;
import com.example.wiki.req.EbookSaveReq;
import com.example.wiki.req.UserReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.resp.UserResp;
import com.example.wiki.service.EbookService;
import com.example.wiki.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    //查询所有
    //@Valid开始参数验证,这里验证的是page的是PageReq的页数
    @GetMapping("/all")
    public CommonResp All(@Valid UserReq userReq){
        CommonResp<PageResp<UserResp>> resp = new CommonResp<>();
        PageResp<UserResp> list= userService.All(userReq);
        resp.setMessage("获取成功");
        resp.setData(list);
        return resp;
    }
    @PostMapping("/save")
    public CommonResp UserSvaeOrUpdate(@Valid @RequestBody UserReq userReq){
        CommonResp resp = new CommonResp<>();
        userService.UserSvaeOrUpdate(userReq);
        resp.setMessage("保存成功");
        return resp;
    }

}
