package com.as.accountmanager.account.service;

import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.account.logic.AccountLogic;

import com.as.accountmanager.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 * AccountManager
 * @date 20230417
 * @author as
 * @version 1
 */
@RestController("/account")
public class AccountManager {
    @Autowired
    private AccountLogic accountLogic;

    @RequestMapping(method= RequestMethod.POST, value="/addUser")
    public void addUser(@RequestParam AccountVO accountVO) {
        Log.info(this.getClass(), "yes");
        accountLogic.insert(accountVO);
    }
}