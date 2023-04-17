package com.as.accountmanager.account.logic;

import com.as.accountmanager.account.dao.AccountDAO;
import com.as.accountmanager.account.dao.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/***
 * AccountLogic
 * @date 20230416
 * @author as
 * @version 1
 */
@Component
public class AccountLogic {
    @Autowired
    private AccountDAO accountDAO;

    public void insert(AccountVO newOne) {
        accountDAO.insert(newOne);
    }

    public void deleteById(String id) {
        accountDAO.deleteById(id);
    }

    public List<AccountVO> search(AccountVO accountVO) {
        return accountDAO.search(accountVO);
    }
}