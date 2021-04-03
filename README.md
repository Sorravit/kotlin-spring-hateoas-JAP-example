Spring HATEOAS provides some APIs to ease creating REST representations that follow the HATEOAS principle 
 
First, run the database (I'm Using port 3302 because of conflict in my machine)
```
docker run --detach --env MYSQL_ROOT_PASSWORD=sorravit --env MYSQL_USER=sorravit --env MYSQL_PASSWORD=sorravit --env MYSQL_DATABASE=big --name mysql --publish 3302:3306 mysql:5.7
```

To test the application you can populate DB either manually or you can use the Curl below
```
curl --request PUT \
  --url http://localhost:8082/people/1 \
  --header 'Content-Type: application/json' \
  --data '{"name": "Big","age":"19"}'
```
