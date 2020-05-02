package cc.mrcwm.febs.system.service.impl;

import cc.mrcwm.febs.system.entity.RoleMenu;
import cc.mrcwm.febs.system.mapper.RoleMenuMapper;
import cc.mrcwm.febs.system.service.IRoleMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mrcwm
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

    @Override
    @Transactional
    public void deleteRoleMenusByRoleId(List<String> roleIds) {
        this.baseMapper.delete(new QueryWrapper<RoleMenu>().lambda().in(RoleMenu::getRoleId, roleIds));
    }

    @Override
    @Transactional
    public void deleteRoleMenusByMenuId(List<String> menuIds) {
        this.baseMapper.delete(new QueryWrapper<RoleMenu>().lambda().in(RoleMenu::getMenuId, menuIds));
    }

}
