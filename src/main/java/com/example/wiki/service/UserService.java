package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.domain.User;
import com.example.wiki.exception.BusinessException;
import com.example.wiki.exception.BusinessExceptionCode;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.mapper.EbookMapperCust;
import com.example.wiki.mapper.UserMapper;
import com.example.wiki.req.EbookReq;
import com.example.wiki.req.EbookSaveReq;
import com.example.wiki.req.UserReq;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.resp.UserResp;
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
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private SnowFlake snowFlake;
    @Resource
    private RedisUtil redisUtil;
    //查询所有
    public PageResp<UserResp> All(UserReq userReq){
        //进行分页
        PageHelper.startPage(userReq.getPage(),userReq.getSize());
        List<User> userList = userMapper.selectByExample(null);
        //将查询的结果转换成想要显示的一些参数
        List<UserResp> list = CopyUtil.copyList(userList,UserResp.class);
        //定义分页类
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        //返回Page
        PageResp<UserResp> pageResp = new PageResp<>();
        //加入分页
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;
    }
    //修改或者增加
    public void UserSvaeOrUpdate(UserReq req){
        User user = CopyUtil.copy(req,User.class);
        if(ObjectUtils.isEmpty(req.getId())){
            user.setUserLevel(1);
            user.setDeleted(false);
            user.setUserUuid("t-5-t");
            user.setStatus(0);
            user.setModifyTime(new Date());
            user.setCreateTime(new Date());
            user.setLastActiveTime(new Date());
            //增加数据
            userMapper.insert(user);
        }else {
            user.setModifyTime(new Date());
            //修改数据
            userMapper.updateByPrimaryKey(user);
        }
    }

//    //批量删除
//    public void DeleteBatchEbook(long[] id){
//        for(int i=0;i<id.length;i++){
//            userMapper.deleteByPrimaryKey(id[i]);
//        }
//    }
//    //单个删除
//    public void DeleteEbook(long id){
//        userMapper.deleteByPrimaryKey(id);
//    }
//    //不能有相同的名字检验
//    public Ebook SelectByName(String name){
//        //固定2个
//        EbookExample ebookExample =new EbookExample();
//        EbookExample.Criteria criteria= ebookExample.createCriteria();
//        //通过传过来的名字
//        criteria.andNameEqualTo(name);
//        //查询
//        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
//        //
//        if(CollectionUtils.isEmpty(ebookList)){
//            return null;
//        }else {
//            return ebookList.get(0);
//        }
//    }
//
//    public void AddDocCount(long id){
//       ebookMapperCust.increaseEbook(id);
//       String ip = RequestContext.getRemoteAddr();
//       if(redisUtil.validateRepeat("DOC_COUNT"+id+"_"+ip,3600*24)){
//           //通过redis判断是否在一天内点赞过
//           ebookMapperCust.increaseEbook(id);
//       }else{
//           //自定义异常处理
//            throw  new BusinessException(BusinessExceptionCode.VOTE_REPEAT);
//       }
//    }
}
