package br.com.saraiva.configurationclient.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ifc.vinicius.saraiva on 22/10/17.
 */
@RefreshScope
@RestController
public class MyController {

    @Value("${message}")
    private String message;

    @RequestMapping("/enviromment")
    public String environment() {
        return message;
    }
}
