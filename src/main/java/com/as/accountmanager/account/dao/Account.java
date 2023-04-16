package com.as.accountmanager.account.dao;

import com.as.accountmanager.account.dao.vo.AccountVO;

import java.util.List;

/***
 * Account
 * @date 20230416
 * @author as
 * @version 1
 */

interface Account {
    public void insert(AccountVO newOne);
    public void delete(AccountVO condition);
    public void modify(AccountVO oldOne, AccountVO newOne);
    public List<AccountVO> search(AccountVO condition);
}