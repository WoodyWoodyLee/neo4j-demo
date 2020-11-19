package com.chinawanpu.neo4jdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @description: 明星类
 * @date: 2020/11/19 14:56
 * @author: QING LI
 * @copyright: 2020 chinawanpu.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@NodeEntity("star")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Star {
    @Id
    @GeneratedValue
    private Long id;
    private String sid;
    private String starId;
    private String name;
    private Integer age;
    private String born;
    private String image;
    private String rating;
    private String released;
    private String roles;
    private String summary;
    private String tagline;
    private String title;
    private String ylqUrl;
}
