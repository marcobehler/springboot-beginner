package com.marcobehler;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MarcoBehlerController {

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getAllVideoCategories() {
        return Stream.of("Spring-Boot", "Spring-Batch", "Spring", "Java 8", "HikariCP", "Jooq", "Hibernate", "Dropwizard", "Logback",
                "Log4j2", "Resteasy", "Dagger", "Dagger 2", "Magnolia CMS", "Wicket", "Jadira Usertypes", "JDBCslog",
                "Liquibase", "Flyway", "Guava", "Args4j", "Joda Money", "Archaius", "Joda Time", "Jamon", "Freemarker",
                "JCommander", "Jetty", "JPos / JCard", "org.reflections", "Jsch", "Zt-ZIP", "Hystrix", "Chaos Monkey",
                "ModelMapper", "Dozer", "BeanUtils", "Java Micro Benchmark", "TestNG", "Awaitility", "AssertJ",
                "Cucumber-JVM", "Mockito", "Rest-Assured", "Wiser / Subethamail", "Jaxb", "XStream", "Jackson",
                "Hikari-JSON", "JSoup", "Hazelcast", "ActiveMQ", "Camel", "Maven", "Gradle", "The Pants", "Kotlin",
                "Scala", "Java 8", "OkHttp", "Apache Http Client", "Artifactory", "Nexus", "Oracle", "H2", "Postgres",
                "JRebel", "Chronon", "Plumbr", "IntelliJ IDEA", "Eclipse")
                .filter(skill -> !skill.contains("j2ee"))
                .sorted()
                .map(Category::new)
                .collect(Collectors.toList());
    }

    public static class Category {
        private final String skill;

        public Category(String skill) {
            this.skill = skill;
        }

        public String getSkill() {
            return skill;
        }
    }
}
