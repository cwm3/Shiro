package cc.mrcwm.febs.common.properties;

import lombok.Data;

/**
 * @author mrcwm
 */
@Data
public class ShiroProperties {

    private long sessionTimeout;
    private int cookieTimeout;
    private String anonUrl;
    private String loginUrl;
    private String successUrl;
    private String logoutUrl;
    private String unauthorizedUrl;
}
