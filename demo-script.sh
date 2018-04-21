java -jar stub-runner.jar --stubrunner.ids=com.example:beer-server:+:stubs:8085 --stubrunner.workOffline=true

curl -X POST -H "Content-Type: application/json"  http://localhost:8085/check  --data '{"age": "22"}'



java -jar -Dstubrunner.stubsMode=LOCAL \
-Dstubrunner.ids=com.example:beer-server,com.example:beer-api-producer:+:stubs \
 ./target/stubrunnereureka-0.0.1-SNAPSHOT.jar


curl -X POST http://localhost:8081/beer -H "Content-Type: application/json" --data '{"name":"marcin"}'
