package com.chinawanpu.neo4jdemo.repository;

import com.chinawanpu.neo4jdemo.entity.Star;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * @description:
 * @date: 2020/11/19 15:14
 * @author: QING LI
 * @copyright: 2020 chinawanpu.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface StarRepository extends Neo4jRepository<Star, Long> {
    /**
     * 根据明星名字找到所有关系
     * @author: QING LI
     * @createDate: 2020/11/19 15:30
     * @updatedDate:
     * @param name 明星名字
     * @return: java.util.List<com.chinawanpu.neo4jdemo.entity.Star>
     */
    @Query("MATCH p =(n:star)-[r:guanxi]->(m:star) WHERE m.name=$name RETURN n")
    List<Star> findFriendByName(String name);

}
