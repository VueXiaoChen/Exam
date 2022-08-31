package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.req.EbookReq;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.util.CopyUtil;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    //查询所有
    public List<EbookResp> list(EbookReq ebookReq){
        //分页
        PageHelper.startPage(ebookReq.getPage(),ebookReq.getSize());
        List<Ebook> ebookList = ebookMapper.selectByExample(null);
        //将查询的结果转换成想要显示的一些参数
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);
        return list;
    }
    //模糊查询
    public List<EbookResp> FindEbookByName(EbookReq ebookReq){

        //下面两项是固定
        EbookExample ebookExample =new EbookExample();
        EbookExample.Criteria criteria= ebookExample.createCriteria();
        //模糊查询
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        //分页查询
        PageHelper.startPage(ebookReq.getPage(),ebookReq.getSize());
        //查询的结果
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        //将查询的结果转换成想要显示的一些参数
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);
        return list;
    }
}
