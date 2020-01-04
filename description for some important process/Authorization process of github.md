
###申请github账号授权流程
    1.用户申请登录页面，并提交github登录申请
    2.服务网站调用github，并发送请求
    3.然后github调用服务网站已经预先填好的地址
    4.github返回token和相关信息给网站
    5.网站接受到信息，携带token和账号再次登录github
    6.github解析数据，数据数据匹配正常，则直接显示登录即可

