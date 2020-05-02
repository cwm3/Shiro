package cc.mrcwm.febs.common.properties;

import lombok.Data;

/**
 * @author mrcwm
 */
@Data
public class SwaggerProperties {
    private String basePackage;
    private String title;
    private String description;
    private String version;
    private String author;
    private String url;
    private String email;
    private String license;
    private String licenseUrl;
}
