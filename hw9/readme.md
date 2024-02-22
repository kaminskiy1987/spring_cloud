1. Eureka gateway - docker http://localhost:8180:
   - http://localhost:8180/service1 -> redirect to http://taskservice1:8080/web/admin
   - http://localhost:8180/service2 -> redirect to http://taskservice2:8080/web/home
   - http://localhost:8180/service3 -> redirect to http://taskservice3:8080/web/login
2. Eureka client + Task service #1 - docker http://localhost:8191/web:
   - http://localhost:8191/web/admin create new tasks
   - http://localhost:8191/web/home check tasks
   - http://localhost:8191/web/login login to service
3. Eureka client + Task service #2 - docker http://localhost:8192/web:
    - http://localhost:8192/web/admin create new tasks
    - http://localhost:8192/web/home check tasks
    - http://localhost:8192/web/login login to service
4. Eureka client + Task service #3 - docker http://localhost:8193/web:
    - http://localhost:8193/web/admin create new tasks
    - http://localhost:8193/web/home check tasks
    - http://localhost:8193/web/login login to service
5. Eureka server - docker http://localhost:8190