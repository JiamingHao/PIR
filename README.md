# Post Service


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