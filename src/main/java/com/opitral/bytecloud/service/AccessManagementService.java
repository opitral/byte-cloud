package com.opitral.bytecloud.service;

import com.opitral.bytecloud.domain.entity.AccessEntity;
import com.opitral.bytecloud.domain.entity.ResourceEntity;
import com.opitral.bytecloud.domain.entity.UserEntity;
import com.opitral.bytecloud.domain.enums.AccessType;

import java.util.List;

public interface AccessManagementService {
    AccessEntity grantAccess(UserEntity user, ResourceEntity resource, AccessType accessType);
    void revokeAccess(UserEntity user, ResourceEntity resource);
    boolean checkAccess(UserEntity user, ResourceEntity resource);
    List<AccessEntity> getAccessListByResource(ResourceEntity resource);
    List<AccessEntity> getAccessListByUser(UserEntity user);
}
