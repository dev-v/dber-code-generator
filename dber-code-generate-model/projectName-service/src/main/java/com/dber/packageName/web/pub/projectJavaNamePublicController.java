package com.dber.#{packageName}.web.pub;

import com.dber.plat.web.api.#{projectJavaName}ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/18
 */
@RestController
@RequestMapping("/pub/")
public class #{projectJavaName}PublicController {

    @Autowired
    private #{projectJavaName}ClientService clientService;

}
