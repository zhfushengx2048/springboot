/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: HelloController
 * Author:   hzg
 * Date:     2019-12-25 12:11
 * Description: 示例hello
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例hello〉
 *
 * @author hzg
 * @create 2019-12-25
 * @since 1.0.0
 */
@Controller
public class HelloController {
    @GetMapping("/hellojsp")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "jsphello";
    }
}