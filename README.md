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


## Dockerfile Image Oluşturma
##### Local'de çalıştırılacak imajlar için kullanım:
````bash
docker build -t configserver:v01 .
````
##### Docker hub üzerinde yayınlamak için kullanım:
````bash
docker build -t huseyin11/configserver:v01 .
docker build -t huseyin11/auth:v02 .
docker build -t huseyin11/user:v02 .
````
##### M Chipli macOS için kullanım:
````bash
docker build --platform linux/amd64 -t huseyin11/configserver:v01 .
-
docker build --platform linux/amd64 -t huseyin11/auth:v02 .
-
docker build --platform linux/amd64 -t huseyin11/user:v02 .
````

## Google Cloud Kubernetes Cluster Canlıya Taşıma
`````bash
kubectl get pods --kiraladığımız makinedeki podları listeler.
kubectl get nodes --kiraladığımız makineleri listeler. üzerinde çalıştığımız makineyi listeler.
kubectl top nodes --kiraladığımız makinelerin özelliklerini listeler.
kubectl apply -f J001_Deployment_PostgreSQL.yml --PostgreSQL için hazırlanan ayarları uygular ve PostgreSQLi pod olarak deploy eder.
kubectl apply -f J002_Service_LoadBalancer_PostgreSQL.yml --PostgreSQL podunu dış dünyaya açar.
kubectl get services --dış dünyaya port açmış podları listeler.
kubectl apply -f J003_Deployment_CofigServer.yml
kubectl apply -f J004_Service_LoadBalancer_Config.yml
kubectl apply -f J005_Deployment_Auth.yml
kubectl apply -f J006_Service_LoadBalancer_Auth.yml
kubectl apply -f J008_Deployment_User.yml
kubectl apply -f J009_Service_LoadBalancer_User.yml
kubectl apply -f J010_Deployment_Mongo.yml
kubectl apply -f J011_Service_LoadBalancer_Mongo.yml
kubectl logs [pod ismi] --ilgili podun console loglarını verir.
kubectl delete services [servis ismi]
kubectl describe services [servis ismi]
kubectl get pods -o wide --podlar hakkında geniş bilgi verir.
`````
![mongo](https://github.com/user-attachments/assets/160fc873-bcdb-4eb4-af51-3e4365daa7be)
![gradle](https://github.com/user-attachments/assets/0607b498-4a27-480e-8408-1e171b0bfd56)
![docker](https://github.com/user-attachments/assets/ce011eb4-4cfb-405d-9a11-448eadc9f5d9)

