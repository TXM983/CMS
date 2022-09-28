package cc.iteachyou.cms.dao;

import java.util.List;

import cc.iteachyou.cms.common.BaseMapper;
import cc.iteachyou.cms.entity.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserRoleMapper继承基类
 */
@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {
	int insertBatchList(List<UserRole> userRoles);
}