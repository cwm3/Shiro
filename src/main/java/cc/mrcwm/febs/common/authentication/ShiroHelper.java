package cc.mrcwm.febs.common.authentication;

import cc.mrcwm.febs.common.annotation.Helper;
import org.apache.shiro.authz.AuthorizationInfo;

/**
 * @author mrcwm
 */
@Helper
public class ShiroHelper extends ShiroRealm {

    /**
     * 获取当前用户的角色和权限集合
     *
     * @return AuthorizationInfo
     */
    public AuthorizationInfo getCurrentuserAuthorizationInfo() {
        return super.doGetAuthorizationInfo(null);
    }
}
