## Docker Image

    PostgreSQL
    userName: postgres
    password: root
    DB: AuthDB
```bash
docker run -d --name postgresql -p 5432:5432 huseyin11/postgresql:v.0.1
```