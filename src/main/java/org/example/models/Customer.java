/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: Customer
 * Author:   hzg
 * Date:     2019-12-23 14:14
 * Description: 示例代码客户类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例代码客户类〉
 *
 * @author hbr
 * @create 2019-12-23
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "t_customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "customer_name")
    private String customerName;
}
