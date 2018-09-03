package io.choerodon.demo.api.controller.v1;

import io.choerodon.demo.Myinfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;


@RestController
//@RequestMapping("v1/21496")
public class DemoController {

    @Autowired
    private Myinfo myinfo;

    @GetMapping("/hello")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
//    @ApiOperation(value = "demo")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello，" + myinfo.getNumber() + "，" + myinfo.getName() + "。", HttpStatus.OK);
    }
}