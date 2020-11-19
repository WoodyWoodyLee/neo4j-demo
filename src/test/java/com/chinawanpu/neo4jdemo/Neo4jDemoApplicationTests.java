package com.chinawanpu.neo4jdemo;

import com.chinawanpu.neo4jdemo.entity.Relationship;
import com.chinawanpu.neo4jdemo.entity.Star;
import com.chinawanpu.neo4jdemo.repository.RelationShipRepository;
import com.chinawanpu.neo4jdemo.repository.StarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Neo4jDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    StarRepository starRepository;
    @Autowired
    RelationShipRepository shipRepository;
    @Test
    void findStarFriendShip(){
        String name = "范冰冰";
        List<Star> friends = starRepository.findFriendByName(name);
        for (Star friend : friends) {
            System.out.println(friend);
        }
        System.out.println("============>>>>>>>>>>>");
        List<Relationship> list = shipRepository.findAllRelationship();
        for (Relationship l : list) {
            System.out.println(l);
        }
    }

}
