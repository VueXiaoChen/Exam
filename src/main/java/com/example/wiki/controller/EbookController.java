package com.example.wiki.controller;



import com.example.wiki.domain.Ebook;
import com.example.wiki.req.EbookReq;
import com.example.wiki.req.EbookSaveReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    //通过书名查询
    @GetMapping("/find")
    public CommonResp FindEbookByName(EbookReq ebookReq){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> result= ebookService.FindEbookByName(ebookReq);
        resp.setMessage("查询成功");
        resp.setData(result);
        return resp;
    }
    //保存
    //@RequestBody注解表示 使用json方式传值
    @PostMapping("/save")
    public CommonResp EbookSave(@Valid @RequestBody EbookSaveReq ebookSaveReq){
        CommonResp resp = new CommonResp<>();
        ebookService.EbookSave(ebookSaveReq);
        return resp;
    }
    //查询所有
    //@Valid开始参数验证,这里验证的是page的是PageReq的页数
    @GetMapping("/findall")
    public CommonResp list(@Valid EbookReq ebookReq){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list= ebookService.list(ebookReq);
        resp.setMessage("获取成功");
        resp.setData(list);
        return resp;
    }
    //批量删除
    @DeleteMapping("/Batchdelete/")
    public CommonResp DeleteBatchEbook(@RequestParam long[] id){
        CommonResp resp = new CommonResp<>();
        ebookService.DeleteBatchEbook(id);
        return resp;
    }
    //单个删除
    @DeleteMapping("/delete/{id}")
    public CommonResp DeleteEbook(@PathVariable long id){
        CommonResp resp = new CommonResp<>();
        ebookService.DeleteEbook(id);
        return resp;
    }
    //Post删除
    @PostMapping("/delete")
    public CommonResp DeleteEbooks(@Valid @RequestBody long[] id){
        CommonResp resp = new CommonResp<>();
        ebookService.DeleteBatchEbook(id);
        return resp;
    }
}
