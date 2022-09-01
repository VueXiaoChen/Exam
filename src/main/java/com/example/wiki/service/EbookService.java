package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.req.EbookReq;
import com.example.wiki.req.EbookSaveReq;
import com.example.wiki.req.PageReq;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.util.CopyUtil;

import com.example.wiki.util.SnowFlake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    @Resource
    private SnowFlake snowFlake;
    //查询所有
    public PageResp<EbookResp> list(EbookReq ebookReq){
        //进行分页
        PageHelper.startPage(ebookReq.getPage(),ebookReq.getSize());
        List<Ebook> ebookList = ebookMapper.selectByExample(null);
        //将查询的结果转换成想要显示的一些参数
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);
        //定义分页类
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        //返回Page
        PageResp<EbookResp> pageResp = new PageResp<>();
        //加入分页
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;
    }
    //模糊查询
    public PageResp<EbookResp> FindEbookByName(EbookReq ebookReq){

        //下面两项是固定
        EbookExample ebookExample =new EbookExample();
        EbookExample.Criteria criteria= ebookExample.createCriteria();
        //模糊查询
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        //分页查询
        PageHelper.startPage(ebookReq.getPage(),ebookReq.getSize());
        //查询的结果
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        //用于获取数据的总数
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        //将查询的结果转换成想要显示的一些参数
        List<EbookResp> result = CopyUtil.copyList(ebookList,EbookResp.class);
        //返回Page
        PageResp<EbookResp> pageResp = new PageResp<>();
        //会犯总页数
        pageResp.setTotal(pageInfo.getTotal());
        //返回数据
        pageResp.setList(result);
        return pageResp;
    }
    //修改或者增加
    public void EbookSave(EbookSaveReq req){
        Ebook ebook = CopyUtil.copy(req,Ebook.class);
        if(ObjectUtils.isEmpty(req.getId())){
            //雪花算法生成Id
            ebook.setId(snowFlake.nextId());
            //增加数据
            ebookMapper.insert(ebook);
        }else {
            //修改数据
            ebookMapper.updateByPrimaryKey(ebook);
        }
    }
    //删除
    public void DeleteEbook(long id){
        ebookMapper.deleteByPrimaryKey(id);
    }

}
