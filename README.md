Spring HATEOAS provides some APIs to ease creating REST representations that follow the HATEOAS principle 
and here's how you can populate DB either manually or you can use the code below 
````
curl --request PUT \
  --url http://localhost:8082/people/1 \
  --header 'Content-Type: application/json' \
  --header 'Postman-Token: 33a91283-9bbb-4771-b9a1-24a66473ebab' \
  --header 'cache-control: no-cache' \
  --data '{\n    "name": "Big",\n	"age":19\n}'
```
