package com.as.accountmanager.account.service;

import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.account.logic.AccountLogic;

import com.as.accountmanager.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/***
 * AccountManager
 * @date 20230417
 * @author as
 * @version 1
 */
@RestController
@RequestMapping("/account")
public class AccountManager {
    @Autowired
    private AccountLogic accountLogic;

    @RequestMapping(method=RequestMethod.POST, value="/addUser")
    public void addUser(@RequestBody AccountVO accountVO) {
        Log.info(this.getClass(), "yes");
        accountLogic.insert(accountVO);
    }
}