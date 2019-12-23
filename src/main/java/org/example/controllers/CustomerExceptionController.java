/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: CustomerExceptionController
 * Author:   hzg
 * Date:     2019-12-23 14:50
 * Description: 示例客户异常类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.controllers;

import org.example.utils.CustomerNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例客户异常返回〉
 *
 * @author hbr
 * @create 2019-12-23
 * @since 1.0.0
 */
@ControllerAdvice
public class CustomerExceptionController {
    @ExceptionHandler(value = CustomerNotfoundException.class)
    public ResponseEntity<Object> exception(CustomerNotfoundException exception) {
        return new ResponseEntity<>("未找到客户", HttpStatus.NOT_FOUND);
    }
}
