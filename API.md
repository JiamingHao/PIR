# Citi Life Hub

## Post
1. 查询帖子: GET '/post/{id}'
2. 获取所有的帖子: GET '/posts'
3. 分页: GET '/posts/{tabType}/{pageNum}/{pageSize}'
4. 发布帖子: POST '/post' 
   1. POST '/post' 
   2. {title: string;
       author: string;
       content: 文档数据库中的文本ID}
   3. 返回体中的content最好支持markdown格式
5. 删除帖子: DELET '/post/{id}'
6. 修改帖子: PUT '/post/{id}' (选做)
   
选做:
活动模块放到帖子下面, 报名活动有人数限制 可以类似秒杀, 有Redis

选做: 热词 内容审核


## Ticket
1. 提交报修单: POST '/ticket'
   1. {item: string;location: string; current_status: started}
2. 查询报修单: GET '/ticket/{id}'
3. 获取所有的报修单: GET '/tickets'
4. 更新报修单的维修状态: PUT '/ticket/{id}/{statusEnum}' 

选做: activiti 框架 监控流程状态



## Gift
访问权限的控制怎么设计
1. 发布礼品: POST '/gift' {name: string; amount: number; unit:number} 应该只有具备某个角色的用户才能执行此操作
2. 获取礼品列表: GET '/gitfs/{pageNum}/{pageSize}'
3. 登记领取礼品: GET '/gift/{id}'
4. 查询礼品: GET '/gift/{keyWord}'



## My Info
用什么方式认证员工身份
什么方式注册
1. 微信端 获取头像 ID等等
2. Citi端 看能取得什么信息


