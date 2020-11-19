package com.chinawanpu.neo4jdemo.repository;

import com.chinawanpu.neo4jdemo.entity.Relationship;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * @description:
 * @date: 2020/11/19 15:24
 * @author: QING LI
 * @copyright: 2020 chinawanpu.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface RelationShipRepository extends Neo4jRepository<Relationship, Long> {
    /**
     * 找出所有人的关系
     * @return 返回关系图
     */
    @Query("MATCH p=()-[r:guanxi]->() RETURN p LIMIT 25")
    List<Relationship> findAllRelationship();
}
