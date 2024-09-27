## Docker Image

    PostgreSQL
    userName: postgres
    password: root
    DB: AuthDB
```bash
docker run -d --name postgresql -p 5432:5432 huseyin11/postgresql:v.0.1
```

```
mongod:
db.createUser({user: "root",pwd: "toor",roles: ["readWrite","dbAdmin"]}) 
MongoDB üzerinde kullanıcı adı root şifresi toor olan okuma, yazma ve dbAdmin yetkilerine sahip olan bir kullanıcı oluşturduk.
```