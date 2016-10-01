package com.action;

import com.biz.UserBiz;
import com.entity.UserEntity;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public class UserManagerAction extends ActionSupport
{
    private String loginName;
    private String loginPwd;

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginPwd(String loginPwd)
    {
        this.loginPwd = loginPwd;
    }

    public String getLoginPwd()
    {
        return loginPwd;
    }

    UserBiz userBiz;

    public void setUserBiz(UserBiz userBiz)
    {
        this.userBiz = userBiz;
    }

    @Override
    public String execute() throws  Exception
    {
        UserEntity condition = new UserEntity();
        condition.setName(loginName);
        condition.setPassword(loginPwd);

        List list = userBiz.login(condition);

        if(list.size() > 0)
        {
            return  "success";
        } else
        {
            return "error";
        }
    }
}
