package com.opitral.bytecloud.service.impl;

import com.opitral.bytecloud.domain.entity.AccessEntity;
import com.opitral.bytecloud.domain.entity.ResourceEntity;
import com.opitral.bytecloud.domain.entity.UserEntity;
import com.opitral.bytecloud.domain.enums.AccessType;
import com.opitral.bytecloud.service.AccessManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessManagementServiceImpl implements AccessManagementService {
    @Override
    public AccessEntity grantAccess(UserEntity user, ResourceEntity resource, AccessType accessType) {
        return null;
    }

    @Override
    public void revokeAccess(UserEntity user, ResourceEntity resource) {

    }

    @Override
    public boolean checkAccess(UserEntity user, ResourceEntity resource) {
        return false;
    }

    @Override
    public List<AccessEntity> getAccessListByResource(ResourceEntity resource) {
        return List.of();
    }

    @Override
    public List<AccessEntity> getAccessListByUser(UserEntity user) {
        return List.of();
    }
}
