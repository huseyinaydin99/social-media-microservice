## PostgreSQL Docker Image

    PostgreSQL
    userName: postgres
    password: root
    DB: AuthDB
```bash
docker run -d --name postgresql -p 5432:5432 huseyin11/postgresql:v.0.1
```

## MongoDB

```
mongod:
db.createUser({user: "root",pwd: "toor",roles: ["readWrite","dbAdmin"]}) 
MongoDB üzerinde kullanıcı adı root şifresi toor olan okuma, yazma ve dbAdmin yetkilerine sahip olan bir kullanıcı oluşturduk.
```

## Docker Redis Single Node

```bash
    docker run --name microservice-redis -p 6379:6379 -d redis
```

```bash
    docker run --name redis-gui -d -p 8001:8001 redislabs/redisinsight:1.14.0
```

## Redis Spring Boot Configuration
    Bağımlılık:
    implementation 'org.springframework.boot:spring-boot-starter-data-redis:3.2.2'

    Redis repository ve Cache olarak kullanılabilir.

```java
@Configuration
@EnableRedisRepositories //Repository aktif etmek için.
@EnableCaching //Cache atif etmek için.
public class RedisConfig {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }

}
```