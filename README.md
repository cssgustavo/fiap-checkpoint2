# fiap-checkpoint2
### Docker

* Execução em DES

```
docker run -d -p 8080:8080 -e PROFILE=dev cssgustavo/fiap-checkpoint2
```

* Execução em STG

```
docker run -d -p 8080:8080 -e PROFILE=stg cssgustavo/fiap-checkpoint2
```

* Execução em PRD

```
docker run -d -p 8080:8080 -e PROFILE=prd cssgustavo/fiap-checkpoint2
```