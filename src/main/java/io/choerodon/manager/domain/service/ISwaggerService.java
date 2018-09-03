package io.choerodon.manager.domain.service;

import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.UiConfiguration;

import java.util.List;

/**
 * swagger业务service
 *
 * @author zhipeng.zuo
 * @author wuguokai
 */
public interface ISwaggerService {

    List<SwaggerResource> getSwaggerResource();

    UiConfiguration getUiConfiguration();

    SecurityConfiguration getSecurityConfiguration();
}
