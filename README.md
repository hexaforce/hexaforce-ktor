# hexaforce-ktor2

## openapi
```
brew install swagger-codegen

openapi-generator list
openapi-generator help generate

# api-server
openapi-generator generate -i openapi.yaml -g kotlin-server -o api-server --package-name io.hexaforce --api-package io.hexaforce.apis --group-id io.hexaforce --artifact-id api-server --artifact-version 0.0.1-SNAPSHOT

openapi-generator generate -i openapi.yaml -g markdown -o api-server/docs

# api-models
openapi-generator generate -i openapi.yaml -g ktorm-schema -o api-models --package-name io.hexaforce.orm --group-id io.hexaforce --artifact-id api-models --artifact-version 0.0.1-SNAPSHOT

# api-client
openapi-generator generate -i openapi.yaml -g kotlin -o api-client --package-name io.hexaforce --api-package io.hexaforce.client --group-id io.hexaforce --artifact-id api-client --artifact-version 0.0.1-SNAPSHOT

```

## prism
```
npm install -g @stoplight/prism-cli

prism mock openapi/api.yaml
```


