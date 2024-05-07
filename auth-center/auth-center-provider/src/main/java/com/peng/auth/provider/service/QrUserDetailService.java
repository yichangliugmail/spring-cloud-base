package com.peng.auth.provider.service;

import com.peng.main.api.mapper.model.BaseUser;
import org.springframework.stereotype.Service;


@Service
public class QrUserDetailService extends BaseUserDetailService {

    @Override
    protected BaseUser getUser(String qrCode) {
        return null;
    }
}
