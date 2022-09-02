package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.exception.BusinessException;
import com.example.wiki.exception.BusinessExceptionCode;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.mapper.EbookMapperCust;
import com.example.wiki.req.EbookReq;
import com.example.wiki.req.EbookSaveReq;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.util.CopyUtil;

import com.example.wiki.util.RedisUtil;
import com.example.wiki.util.RequestContext;
import com.example.wiki.util.SnowFlake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    @Resource
    private SnowFlake snowFlake;
    @Resource
    private EbookMapperCust ebookMapperCust;
    @Resource
    private RedisUtil redisUtil;
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

            if(ObjectUtils.isEmpty(SelectByName(req.getName()))){
                //雪花算法生成Id
                ebook.setId(snowFlake.nextId());
                //增加数据
                ebookMapper.insert(ebook);
            }else{
                //自定义检验
                throw  new BusinessException(BusinessExceptionCode.USER_LOGIN_NAME_EXIST);
            }
        }else {
            //修改数据
            ebookMapper.updateByPrimaryKey(ebook);
        }
    }
    //批量删除
    public void DeleteBatchEbook(long[] id){
        for(int i=0;i<id.length;i++){
            ebookMapper.deleteByPrimaryKey(id[i]);
        }
    }
    //单个删除
    public void DeleteEbook(long id){
        ebookMapper.deleteByPrimaryKey(id);
    }
    //不能有相同的名字检验
    public Ebook SelectByName(String name){
        //固定2个
        EbookExample ebookExample =new EbookExample();
        EbookExample.Criteria criteria= ebookExample.createCriteria();
        //通过传过来的名字
        criteria.andNameEqualTo(name);
        //查询
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        //
        if(CollectionUtils.isEmpty(ebookList)){
            return null;
        }else {
            return ebookList.get(0);
        }
    }

    public void AddDocCount(long id){
       ebookMapperCust.increaseEbook(id);
       String ip = RequestContext.getRemoteAddr();
       if(redisUtil.validateRepeat("DOC_COUNT"+id+"_"+ip,3600*24)){
           //通过redis判断是否在一天内点赞过
           ebookMapperCust.increaseEbook(id);
       }else{
           //自定义异常处理
            throw  new BusinessException(BusinessExceptionCode.VOTE_REPEAT);
       }
    }
}
