# hexaforce-ktor


## openapi
```
brew install swagger-codegen

openapi-generator list

openapi-generator generate -i openapi/api.yaml -g kotlin-server -o out 
openapi-generator generate -i openapi/api.yaml -g markdown -o out 


```

## prism
```
npm install -g @stoplight/prism-cli

prism mock openapi/api.yaml
```
