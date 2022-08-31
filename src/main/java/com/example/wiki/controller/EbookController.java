package com.example.wiki.controller;



import com.example.wiki.domain.Ebook;
import com.example.wiki.req.EbookReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    //通过书名查询
    @GetMapping("/find")
    public CommonResp FindEbookByName(EbookReq ebookReq){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list= ebookService.FindEbookByName(ebookReq);
        resp.setMessage("查询成功");
        resp.setData(list);
        return resp;
    }
    //查询所有
    @GetMapping("/findall")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list= ebookService.list();
        resp.setMessage("获取成功");
        resp.setData(list);
        return resp;
    }
}
