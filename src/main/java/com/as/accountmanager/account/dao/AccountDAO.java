package com.as.accountmanager.account.dao;

import com.as.accountmanager.account.dao.vo.AccountVO;
import jdk.jfr.Registered;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/***
 * Account
 * @date 20230416
 * @author as
 * @version 1
 */
@Mapper
public interface AccountDAO {
    void insert(AccountVO newOne);
    void deleteById(String id);
    void modifyById(AccountVO accountVO);
    List<AccountVO> search(AccountVO condition);
}