# SpringBoot Framework Hackathon

#### Build

```bash
./gradlew build
```

Windows OS

```bash
gradlew.bat build
```

Will produce ```build/libs/odenktools-springhackathon-0.1.0.jar```

#### Run

```bash
cd build/libs/

java -jar odenktools-springhackathon-0.1.0.jar
```

#### Test

```bash
curl -X GET http://localhost:8080/apikey/all
```

```bash
curl -X POST \
  http://localhost:8080/apikey/add \
  -H 'content-type: application/json' \
  -d '{
	"keyCode":"sdf234234sdf",
	"secretKey":"123dsfsfd3767J"
}'
```

```bash
curl -X GET \
  'http://localhost:8080/apikey/add?keyCode=sfdsdfsdfsdf&secretKey=123123asd12'
```