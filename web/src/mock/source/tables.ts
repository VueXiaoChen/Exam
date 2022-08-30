import { MockMethod } from 'vite-plugin-mock'
import Mock from 'mockjs';
import { Random } from "mockjs";
let datas =[]
for (var i = 0; i < 444; i++) {
  let data = {
    id:i+1,
    name: Random.cname(),
    age: Random.integer(20, 50),
    birth: Random.datetime("yyyy-MM-dd HH:mm:ss"),  // 值是指定格式的日期字符串
    // birth2: new Date(Random.datetime("yyyy-MM-dd HH:mm:ss")),  // 值是 Date 类型
    addr: `${Random.province()}-${Random.city()}-${Random.county()}`,
    email: Random.email("qq.com"),
    // word: Random.cword(2, 5),
    // string: Random.string(),
    // senetence: Random.csentence(15, 20),
    // paragraph: Random.cparagraph(),
  };
  datas.push(data)
}

export default [
  {
    url: '/api/tables', // 注意，这里只能是string格式
    method: 'post',
    response: {
      code: 200,
      data: datas
    },
  },
  {
    url: '/api/tables/add', // 注意，这里只能是string格式
    method: 'post',
    response: {
      code: 200,
      success:true,
      msg:"添加成功"
    },
  },
  {
    url: '/api/tables/edit', // 注意，这里只能是string格式
    method: 'post',
    response: {
      code: 200,
      success:true,
      msg:"修改成功"
    },
  },


] as MockMethod[]
