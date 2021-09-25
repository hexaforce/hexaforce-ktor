# hexaforce-ktor


## openapi
```
brew install swagger-codegen

openapi-generator list
openapi-generator help generate
openapi-generator generate -i openapi/api.yaml -g kotlin-server -o kotlin-server --package-name io.hexaforce
openapi-generator generate -i openapi/api.yaml -g ktorm-schema -o ktorm-schema --package-name io.hexaforce

```

## prism
```
npm install -g @stoplight/prism-cli

prism mock openapi/api.yaml
```
