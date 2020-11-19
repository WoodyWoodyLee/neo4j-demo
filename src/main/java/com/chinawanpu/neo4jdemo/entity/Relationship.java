package com.chinawanpu.neo4jdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

/**
 * @description: 明星之间关系类
 * @date: 2020/11/19 15:17
 * @author: QING LI
 * @copyright: 2020 chinawanpu.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@RelationshipEntity("guanxi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Relationship {
    @Id
    @GeneratedValue
    private Long id;
    private String label;
    @StartNode
    private Star starFrom;
    @EndNode
    private Star starEnd;
}
